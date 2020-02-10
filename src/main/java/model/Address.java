package model;

public class Address {
    private String street;
    private String city;
    private int houseNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Address(String street, String city, int houseNumber) {
        this.street = street;
        this.city = city;
        this.houseNumber = houseNumber;
    }
}
