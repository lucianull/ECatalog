package Models;

import java.util.Objects;

public class Address implements Cloneable {
    private String details, city, county;

    public Address(String details, String city, String county) {
        this.details = details;
        this.city = city;
        this.county = county;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.details, other.details)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return Objects.equals(this.county, other.county);
    }
    
    @Override
    public String toString() {
        return details + ',' + city + ',' + county;
    }
    
    @Override
    public Address clone() {
        try {
            Address clonedAddress = (Address) super.clone();
            return clonedAddress;
        }catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
