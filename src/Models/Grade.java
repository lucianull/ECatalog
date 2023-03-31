package Models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Grade implements Cloneable{
    private int gradeId;
    private int studentId;
    private int subjectId;
    private float grade;

    public Grade(int gradeId, int studentId, int subjectId, float grade) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.grade = grade;
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
        return Float.floatToIntBits(this.grade) == Float.floatToIntBits(other.grade);
    }
    
    @Override
    public Grade clone()
    {
        try {
            Grade clone = (Grade) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    
}
