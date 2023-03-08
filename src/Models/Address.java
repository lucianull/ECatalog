package Models;

public class Address implements Cloneable {
    private String street, number, block, sc, city, county;
    private int addressId, apartment, level;
    
    public Address() {
       street = "";
       number = "";
       block = "";
       sc = "";
       city = "";
       county = "";
       addressId = 0;
       apartment = 0;
       level = 0;
    }
    
    public Address(int addressId, String street, String number, String block, String sc, int level, int apartment, String city, String county) {
       this.street = street;
       this.number = number;
       this.block = block;
       this.sc = sc;
       this.city = city;
       this.county = county;
       this.addressId = addressId;
       this.apartment = apartment;
       this.level = level;
    }
    
    public Address(final Address adress) {
       this.street = adress.street;
       this.number = adress.number;
       this.block = adress.block;
       this.sc = adress.sc;
       this.city = adress.city;
       this.county = adress.county;
       this.addressId = adress.addressId;
       this.apartment = adress.apartment;
       this.level = adress.level;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
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

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int adressId) {
        this.addressId = adressId;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
