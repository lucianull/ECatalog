package Controllers;

import Models.Course;
import Models.Professor;
import Models.Subject;
import Models.User;
import SQLDatabase.DbContext;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class ProfessorsController {

    private DbContext dbContext;
    private Professor currentProfessor;
    private HashMap<String, Integer> professorStudents;
    private HashMap<String, Integer> professorSubjects;
    private HashMap<String, Integer> professorClasses;

    public ProfessorsController(User currentUser) {
        dbContext = DbContext.getInstance();
        currentProfessor = (Professor) currentUser;
    }

    public String[] getSubjects() {
        ArrayList< String> subjects = new ArrayList< String>();
        professorSubjects = new HashMap< String, Integer>();
        try {
            String sql = "SELECT t2.subjectName, t2.subjectId FROM courses t1 LEFT JOIN subjects t2 ON t1.subjectId = t2.subjectId WHERE t1.professorId = ? GROUP BY t2.subjectName, t2.subjectId";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, currentProfessor.getUserId());
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                subjects.add(result.getString("subjectName"));
                professorSubjects.put(result.getString("subjectName"), result.getInt("subjectId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjects.toArray(new String[subjects.size()]);
    }

    public String[] getClasses(String subjectName) {
        ArrayList< String> classes = new ArrayList<String>();
        professorClasses = new HashMap< String, Integer>();
        try {
            String sql = "SELECT t2.name, t2.classId FROM courses t1 LEFT JOIN classes t2 ON t1.classId = t2.classId WHERE t1.professorId = ? AND t1.subjectId = ? GROUP BY t2.name, t2.classId";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, currentProfessor.getUserId());
            statement.setInt(2, professorSubjects.get(subjectName));
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                classes.add(result.getString("name"));
                professorClasses.put(result.getString("name"), result.getInt("classId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return classes.toArray(new String[classes.size()]);
    }

    public String[] getStudents(String className) {
        ArrayList< String> students = new ArrayList<String>();
        professorStudents = new HashMap< String, Integer>();
        try {
            String sql = "SELECT users.userId, users.firstName, users.lastName FROM students LEFT JOIN users ON students.userId = users.userId WHERE students.classId = ?";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, professorClasses.get(className));
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String name = result.getString("firstName") + ' ' + result.getString("lastName");
                students.add(name);
                professorStudents.put(name, result.getInt("userId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students.toArray(new String[students.size()]);
    }

    public ArrayList< String[]> getGrades(String student, String semester, String subject) {
        byte sem = 0;
        if (semester.equals("II")) {
            sem = 1;
        }
        ArrayList< String[]> grades = new ArrayList<String[]>();
        try {
            String sql = "SELECT grade, gradeDate, thesis FROM grades WHERE subjectId = ? AND semester = ? AND studentId = ? ORDER BY gradeDate";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, professorSubjects.get(subject));
            statement.setInt(2, sem);
            statement.setInt(3, professorStudents.get(student));
            ResultSet result = statement.executeQuery();
            String grade = null;
            String date = null;
            while(result.next()) {
                java.sql.Date gradeDate = result.getDate("gradeDate");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(gradeDate);
                grade = Float.toString(result.getFloat("grade"));
                if(result.getByte("thesis") == 1) {
                    grade += "(TEZA)";
                }
                date = String.format("%02d-%02d-%04d", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
                grades.add(new String[] {grade, date});
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
    }

    public void insertGrade(String semester, String subject, String className, String student, float grade, byte thesis) {
        try {
            byte sem = 0;
            if (semester.equals("II")) {
                sem = 1;
            }
            Date currentDate = new Date();
            long currentTimeMillis = currentDate.getTime();
            java.sql.Date sqlDate = new java.sql.Date(currentTimeMillis);
            String sql = "INSERT INTO grades (studentId, subjectId, grade, gradeDate, semester, thesis) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
            statement.setInt(1, professorStudents.get(student));
            statement.setInt(2, professorSubjects.get(subject));
            statement.setFloat(3, grade);
            statement.setDate(4, sqlDate);
            statement.setByte(5, sem);
            statement.setByte(6, thesis);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList< String[]>[] getCourses() {
        ArrayList< String[]>[] courses = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            courses[i] = new ArrayList< String[]>();
        }
        ArrayList< Course>[] schedule = currentProfessor.getSchedule();
        if (schedule == null) {
            try {
                initSchedule();
                schedule = currentProfessor.getSchedule();
            } catch (SQLException ex) {
                Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        HashMap< Integer, String> subjects = new HashMap< Integer, String>();
        HashMap< Integer, String> classes = new HashMap< Integer, String>();

        for (int i = 0; i < courses.length; i++) {
            for (Course course : schedule[i]) {
                if (subjects.containsKey(course.getSubjectId()) == false) {
                    try {
                        String sql = "SELECT subjectName FROM subjects WHERE subjectId = ?";
                        PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
                        statement = dbContext.getConnection().prepareStatement(sql);
                        statement.setInt(1, course.getSubjectId());
                        ResultSet result = statement.executeQuery();
                        if (result.next()) {
                            subjects.put(course.getSubjectId(), result.getString("subjectName"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (classes.containsKey(course.getClassId()) == false) {
                    try {
                        String sql = "SELECT name FROM classes WHERE classId = ?";
                        PreparedStatement statement = dbContext.getConnection().prepareStatement(sql);
                        statement.setInt(1, course.getClassId());
                        ResultSet result = statement.executeQuery();
                        if (result.next()) {
                            classes.put(course.getClassId(), result.getString("name"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String[] courseDetails = new String[]{
                    subjects.get(course.getSubjectId()),
                    classes.get(course.getClassId()),
                    String.format("%02d", course.getStartHour()) + ':' + String.format("%02d", course.getStartMinute())
                };
                courses[i].add(courseDetails);
            }
        }
        return courses;
    }
    private void initSchedule() throws SQLException {
        ArrayList< Course>[] schedule = new ArrayList[5];
        Course newCourse = null;
        for (int i = 0; i < schedule.length; i++) {
            schedule[i] = new ArrayList< Course>();
        }
        String innerSql = "SELECT * FROM courses LEFT JOIN subjects ON courses.subjectId = subjects.subjectId WHERE professorId = ? ORDER BY starting_time_hour, starting_time_minute";
        PreparedStatement innerStatement = dbContext.getConnection().prepareStatement(innerSql);
        innerStatement.setInt(1, currentProfessor.getUserId());
        ResultSet result = innerStatement.executeQuery();
        while (result.next()) {
            Course.Day dayEnum = Course.Day.MONDAY;
            String receivedDay = result.getString("day");
            switch (receivedDay) {
                case "Monday":
                    dayEnum = Course.Day.MONDAY;
                    break;
                case "Tuesday":
                    dayEnum = Course.Day.TUESDAY;
                    break;
                case "Wednesday":
                    dayEnum = Course.Day.WEDNESDAY;
                    break;
                case "Thursday":
                    dayEnum = Course.Day.THURSDAY;
                    break;
                case "Friday":
                    dayEnum = Course.Day.FRIDAY;
                    break;
            }
            newCourse = new Course(result.getInt("courseId"), result.getInt("starting_time_hour"), result.getInt("starting_time_minute"),
                    result.getInt("subjectId"), result.getInt("classId"), result.getInt("professorId"), dayEnum);
            newCourse.setSubject(new Subject(result.getInt("subjectId"), result.getString("subjectName")));
            schedule[dayEnum.ordinal()].add(newCourse);
        }
        currentProfessor.setSchedule(schedule);
    }
}
