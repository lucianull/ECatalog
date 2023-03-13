package Models;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int userId;
    private Address residence;
    private Date birthDate;
    private int roleId;
    private String password;

    public User(String firstName, String lastName, String email, String phoneNumber, int userId, Address residence, Date birthDate, int roleId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        this.residence = residence;
        this.roleId = roleId;
        this.password = password;
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

    public void setResidence(Address residence) throws CloneNotSupportedException {
        this.residence = (Address) residence.clone();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return this.userId;
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
        final User other = (User) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.roleId != other.roleId) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.residence, other.residence)) {
            return false;
        }
        return Objects.equals(this.birthDate, other.birthDate);
    }


    
}
