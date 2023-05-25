package Models;

public class Course implements Cloneable{
    private int courseId;
    private int startHour;
    private int startMinute;
    private int subjectId;
    private int professorId;
    private Day day;
    private Subject subject = null;
    
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY
    }

    public Course(int courseId, int startHour, int startMinute, int subjectId, int professorId, Day day) {
        this.courseId = courseId;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.subjectId = subjectId;
        this.professorId = professorId;
        this.day = day;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (this.courseId != other.courseId) {
            return false;
        }
        if (this.startHour != other.startHour) {
            return false;
        }
        if (this.startMinute != other.startMinute) {
            return false;
        }
        if (this.subjectId != other.subjectId) {
            return false;
        }
        if (this.professorId != other.professorId) {
            return false;
        }
        return this.day == other.day;
    }
    
    @Override
    public Course clone() {
        try {
            Course clone = (Course) super.clone();
            clone.day = this.day; // Enums are immutable, no need to create a copy
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
