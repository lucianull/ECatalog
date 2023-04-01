package Controllers;

import Models.Absence;
import Models.Professor;
import Models.Student;
import Models.User;
import SQLDatabase.DbContext;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class StudentsController {

    private DbContext dbContext;
    private Student currentStudent;

    public StudentsController(User currentUser) {
        dbContext = DbContext.getInstance();
        currentStudent = (Student) currentUser;
    }

    public Models.Class getStudentClass() throws SQLException {
        Models.Class studentClass = currentStudent.getStudentClass();
        if (studentClass == null) {
            String sql = "SELECT * FROM classes WHERE classId = ?";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, currentStudent.getClassId());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                studentClass = new Models.Class(result.getInt("classId"), result.getString("name"), result.getInt("classMasterId"));
                currentStudent.setStudentClass(studentClass);
            } else {
                throw new NullPointerException("Class doesn't exist in database");
            }
        }
        return studentClass;
    }

    public Professor getStudentClassProfessor() throws SQLException {
        if (this.getStudentClass().getClassMaster() == null) {
            String sql = "SELECT * FROM users INNER JOIN professors ON users.userId = professors.userId WHERE users.userId = ?";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, this.getStudentClass().getClassMasterId());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Date birthdate = result.getDate("birthDate");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(birthdate);
                int bDay = calendar.get(Calendar.DAY_OF_MONTH);
                int bMonth = calendar.get(Calendar.MONTH);
                int bYear = calendar.get(Calendar.YEAR);
                Date hireDate = result.getDate("hireDate");
                calendar.setTime(hireDate);
                currentStudent.getStudentClass().setClassMaster(new Professor(result.getInt("userId"), result.getString("firstName"),
                        result.getString("lastName"), result.getString("email"), result.getString("password"),
                        result.getString("phoneNumber"), bDay, bMonth, bYear, result.getString("addressDetails"),
                        result.getString("city"), result.getString("county"),
                        result.getString("gender"), calendar.get(Calendar.DAY_OF_MONTH),
                        calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR)));
            } else {
                throw new NullPointerException("Professor doesn't exist in database");
            }

        }
        return currentStudent.getStudentClass().getClassMaster();
    }

    public String getFullName() {
        return currentStudent.getLastName() + ' ' + currentStudent.getFirstName();
    }

    public String getEmail() {
        return currentStudent.getEmail();
    }

    public User getUser() {
        return currentStudent;
    }

    public ArrayList< String[]> getAbsences(String semester) throws SQLException {
        byte sem = 0;
        if (semester.equals("II")) {
            sem = 1;
        }
        ArrayList< String[]> absences = new ArrayList<>();
        ArrayList< Absence> studentAbsences = currentStudent.getAbsences();

        if (studentAbsences == null) {
            String sql = "SELECT * FROM studentabsences WHERE studentId = ?";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, currentStudent.getUserId());
            ResultSet result = statement.executeQuery();
            studentAbsences = new ArrayList<>();
            while (result.next()) {
                Date absenceDate = result.getDate("absence_date");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(absenceDate);
                studentAbsences.add(new Absence(result.getInt("id"), result.getInt("studentId"),
                        result.getInt("subjectId"), calendar.get(Calendar.DAY_OF_MONTH),
                        calendar.get(Calendar.MONDAY), calendar.get(Calendar.YEAR), result.getByte("semester")));
            }
            currentStudent.setAbsences(studentAbsences);
        }
        HashMap< Integer, String> subjects = new HashMap<>();
        for (Absence absence : studentAbsences) {
            if (absence.getSemester() == sem) {
                if (subjects.containsKey(absence.getSubjectId()) == false) {
                    String sql = "SELECT subjectName FROM subjects WHERE subjectId = ?";
                    PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
                    statement = dbContext.getConnection().prepareStatement(sql);
                    statement.setInt(1, absence.getSubjectId());
                    ResultSet result = statement.executeQuery();
                    if(result.next()) {
                        subjects.put(absence.getSubjectId(), result.getString("subjectName"));
                    }
                }
                absences.add(new String[]{subjects.get(absence.getSubjectId()), absence.getAbsenceDate().toString()});
            }
        }
        return absences;
    }
}
