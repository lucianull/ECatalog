package Models;

import java.util.ArrayList;
import java.util.Objects;

public class Professor extends User{

    private Date hireDate;
    private ArrayList <Course>[] schedule = null;

    public Professor(int userId, String firstName, String lastName, String email, String password, String phoneNumber, int bDay, int bMonth, int bYear, String residenceDetails, String city, String county, String gender, int hDay, int hMonth, int hYear) {
        super(userId, firstName, lastName, email, password, phoneNumber, bDay, bMonth, bYear, residenceDetails, city, county, gender);
        hireDate = new Date(hYear, hMonth, hDay);
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public ArrayList<Course>[] getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<Course>[] schedule) {
        this.schedule = schedule;
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
        final Professor other = (Professor) obj;
        return Objects.equals(this.hireDate, other.hireDate);
    }
    
    public Professor clone() {
        try {
            Professor clonedProfessor = (Professor) super.clone();
            clonedProfessor.hireDate = (Date) this.hireDate.clone();
            return clonedProfessor;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
