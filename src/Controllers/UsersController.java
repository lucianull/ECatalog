
package Controllers;

import Models.Professor;
import Models.Student;
import Models.User;
import Models.Class;
import SQLDatabase.DbContext;
import java.sql.*;
import java.util.Calendar;

public class UsersController {
    private DbContext dbContext;
    private User currentUser;
    
    
    public UsersController() {
        dbContext = DbContext.getInstance();
    }
    public boolean CheckUser(String email, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, password);
        ResultSet result = statement.executeQuery();
        if(result.next()) {
            int userId = result.getInt("userId");
            String firstName = result.getString("firstName");
            String lastName = result.getString("lastName");
            String phoneNumber = result.getString("phoneNumber");
            Date birthdate = result.getDate("birthdate");
            String gender = result.getString("gender");
            String addressDetails = result.getString("addressDetails");
            String city = result.getString("city");
            String county = result.getString("county");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthdate);
            int bDay = calendar.get(Calendar.DAY_OF_MONTH);
            int bMonth = calendar.get(Calendar.MONTH);
            int bYear = calendar.get(Calendar.YEAR);
            sql = "SELECT * FROM professors WHERE userId = ?";
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet r = statement.executeQuery();
            if(r.next()) {
                Date hireDate = r.getDate("hireDate");
                calendar.setTime(hireDate);
                currentUser = new Professor(userId, firstName, lastName, email, password, phoneNumber, bDay, bMonth, 
                        bYear, addressDetails, city, county, gender, calendar.get(Calendar.DAY_OF_MONTH),
                        calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
                return true;
            }
            sql = "SELECT * FROM students WHERE userId = ?";
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, userId);
            r = statement.executeQuery();
            if(r.next()) {
                currentUser = new Student(r.getInt("classId"), r.getString("matriculationNumber"), 
                        r.getString("parentFirstName"), r.getString("parentLastName"),
                        r.getString("parentPhoneNumber"), r.getString("parentEmail"), 
                        userId, firstName, lastName, email, password, phoneNumber, bDay, bMonth, bYear, addressDetails, 
                        city, county, gender);
                return true;
            }
        }
        return false;
    }
    public String getFullName() {
        return currentUser.getLastName() + ' ' + currentUser.getFirstName();
    }
    public String getEmail() {
        return currentUser.getEmail();
    }
    public User getUser() {
        return currentUser;
    }
    
    public Class getStudentClass() throws SQLException {
        Student student = (Student) currentUser;
        Class studentClass = student.getStudentClass();
        if(studentClass == null) {
            String sql = "SELECT * FROM classes WHERE classId = ?";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, student.getClassId());
            ResultSet result = statement.executeQuery();
            if(result.next()) {
                studentClass = new Class(result.getInt("classId"), result.getString("name"), result.getInt("classMasterId"));
                student.setStudentClass(studentClass);
            }
            else{
                throw new NullPointerException("Class doesn't exist in database");
            }
        }
        return studentClass;
    }
    public Professor getStudentClassProfessor() throws SQLException{
        Student student = (Student) currentUser;
        if(this.getStudentClass().getClassMaster()== null) {
                String sql = "SELECT * FROM users INNER JOIN professors ON users.userId = professors.userId WHERE users.userId = ?";
                PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
                statement = dbContext.getConnection().prepareStatement(sql);
                statement.setInt(1, this.getStudentClass().getClassMasterId());
                ResultSet result = statement.executeQuery();
                if(result.next()) {
                    Date birthdate = result.getDate("birthDate");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(birthdate);
                    int bDay = calendar.get(Calendar.DAY_OF_MONTH);
                    int bMonth = calendar.get(Calendar.MONTH);
                    int bYear = calendar.get(Calendar.YEAR);
                    Date hireDate = result.getDate("hireDate");
                    calendar.setTime(hireDate);
                    student.getStudentClass().setClassMaster(new Professor(result.getInt("userId"), result.getString("firstName"), 
                                                            result.getString("lastName"), result.getString("email"), result.getString("password"),
                                                            result.getString("phoneNumber"), bDay, bMonth, bYear, result.getString("addressDetails"), 
                                                            result.getString("city"), result.getString("county"),
                                                            result.getString("gender"), calendar.get(Calendar.DAY_OF_MONTH),
                                                            calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR)));
                }
                else {
                    throw new NullPointerException("Professor doesn't exist in database");
                }
                
            }
        return student.getStudentClass().getClassMaster();
    }
}
