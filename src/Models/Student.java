
package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class Student extends User {

    private int classId;
    private String matriculationNr;
    private String parentFirstName;
    private String parentLastName;
    private String parentPhoneNumber;
    private String parentEmail;
    private Optional < Collection < Grade > > grades;

    public Student(int classId, String matriculationNr, String parentFirstName, String parentLastName, String parentPhoneNumber, String parentEmail, int userId, String firstName, String lastName, String email, String password, String phoneNumber, int bDay, int bMonth, int bYear, String residenceDetails, String city, String county, char gender) {
        super(userId, firstName, lastName, email, password, phoneNumber, bDay, bMonth, bYear, residenceDetails, city, county, gender);
        this.classId = classId;
        this.matriculationNr = matriculationNr;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.parentPhoneNumber = parentPhoneNumber;
        this.parentEmail = parentEmail;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getMatriculationNr() {
        return matriculationNr;
    }

    public void setMatriculationNr(String matriculationNr) {
        this.matriculationNr = matriculationNr;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public Optional<Collection<Grade>> getGrades() {
        return grades;
    }

    public void setGrades(Optional<Collection<Grade>> grades) {
        this.grades = grades;
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
        final Student other = (Student) obj;
        if (this.classId != other.classId) {
            return false;
        }
        if (!Objects.equals(this.matriculationNr, other.matriculationNr)) {
            return false;
        }
        if (!Objects.equals(this.parentFirstName, other.parentFirstName)) {
            return false;
        }
        if (!Objects.equals(this.parentLastName, other.parentLastName)) {
            return false;
        }
        if (!Objects.equals(this.parentPhoneNumber, other.parentPhoneNumber)) {
            return false;
        }
        return Objects.equals(this.parentEmail, other.parentEmail);
    }
    
    @Override
    public Student clone() {
        Student clonedStudent = (Student) super.clone();
        return clonedStudent;
    }

    @Override
    public String toString() {
        return getUserId() + ',' + getEmail() + ',' + getPassword() + ',' + getFirstName() + ',' + getLastName() + ',' + getPhoneNumber() + ',' + getResidence().toString() + ',' + getBirthDate().toString() + ',' + classId + ',' + matriculationNr + ',' + parentFirstName + ',' + parentLastName + ',' + parentPhoneNumber + ',' + parentEmail;
    }
    
}
