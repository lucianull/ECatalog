package Models;

import java.util.Objects;

public class Grade implements Cloneable{
    private int gradeId;
    private int studentId;
    private int subjectId;
    private float grade;
    private Date gradeDate;
    private byte semester;
    private byte thesis;

    public Grade(int gradeId, int studentId, int subjectId, float grade, Date gradeDate, byte semester, byte thesis) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.grade = grade;
        this.gradeDate = gradeDate;
        this.semester = semester;
        this.thesis = thesis;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Date getGradeDate() {
        return gradeDate;
    }

    public void setGradeDate(Date gradeDate) {
        this.gradeDate = gradeDate;
    }

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }

    public byte getThesis() {
        return thesis;
    }

    public void setThesis(byte thesis) {
        this.thesis = thesis;
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
        final Grade other = (Grade) obj;
        if (this.gradeId != other.gradeId) {
            return false;
        }
        if (this.studentId != other.studentId) {
            return false;
        }
        if (this.subjectId != other.subjectId) {
            return false;
        }
        if (Float.floatToIntBits(this.grade) != Float.floatToIntBits(other.grade)) {
            return false;
        }
        if (this.semester != other.semester) {
            return false;
        }
        if (this.thesis != other.thesis) {
            return false;
        }
        return Objects.equals(this.gradeDate, other.gradeDate);
    }
    
    public Grade clone() throws CloneNotSupportedException {
        return (Grade) super.clone();
    }
    
}
