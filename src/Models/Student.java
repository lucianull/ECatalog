
package Models;

public class Student extends User {

    private int classId;
    private String matriculationNr;
    private String parentFirstName;
    private String parentLastName;
    private String parentPhoneNumber;
    private String parentEmail;
    
    public Student(String firstName, String lastName, String email, String phoneNumber, int userId, Address residence, Date birthDate, 
            int classId, String matriculationNr, String parentFirstName, String parentLastName, String parentPhoneNumber, String parentEmail) {
        super(firstName, lastName, email, phoneNumber, userId, residence, birthDate);
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
}
