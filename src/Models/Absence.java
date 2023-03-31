
package Models;
import java.util.Objects;

public class Absence implements Cloneable{
    private int absenceId;
    private int studentId;
    private int subjectId;
    private Date absenceDate;

    public Absence(int absenceId, int studentId, int subjectId, int day, int month, int year) {
        this.absenceId = absenceId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.absenceDate = new Date(year, month, day);
    }

    public int getAbsenceId() {
        return absenceId;
    }

    public void setAbsenceId(int absenceId) {
        this.absenceId = absenceId;
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

    public Date getAbsenceDate() {
        return absenceDate;
    }

    public void setAbsenceDate(Date absenceDate) {
        this.absenceDate = absenceDate;
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
        final Absence other = (Absence) obj;
        if (this.absenceId != other.absenceId) {
            return false;
        }
        if (this.studentId != other.studentId) {
            return false;
        }
        if (this.subjectId != other.subjectId) {
            return false;
        }
        return Objects.equals(this.absenceDate, other.absenceDate);
    }
    public Absence clone() {
        try {
            Absence clonedAbsence = (Absence) super.clone();
            clonedAbsence.absenceDate = (Date) this.absenceDate.clone();
            return clonedAbsence;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
