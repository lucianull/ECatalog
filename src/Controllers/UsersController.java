
package Controllers;

import CSVLogs.CSVReaderWriter;
import Models.Professor;
import Models.Student;
import Models.User;
import Models.Class;
import SQLDatabase.DbContext;
import java.sql.*;
import java.time.Instant;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;

public class UsersController {
    private DbContext dbContext;
    private User currentUser;
    
    
    public UsersController() {
        dbContext = DbContext.getInstance();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
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
    public boolean CheckUserType() {
        if(currentUser instanceof Student) {
            return false;
        }
        return true;
    }

}
