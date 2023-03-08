package Models;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int userId;
    private Address residence;
    private Date birthDate;

    public User(String firstName, String lastName, String email, String phoneNumber, int userId, Address residence, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        try {
            this.residence = (Address) residence.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Unable to copy user residence");
            ex.printStackTrace();
        }
        try {
            this.birthDate = (Date) birthDate.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Unable to copy user birthdate");
            ex.printStackTrace();
        }
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Address getResidence() {
        return residence;
    }

    public void setResidence(Address residence) {
        this.residence = residence;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
