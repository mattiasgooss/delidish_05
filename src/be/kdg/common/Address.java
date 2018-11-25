package be.kdg.common;

public class Address {
    private City city;
    private String street;
    private String number;
    private Position position;
    private String country;

    public Address(City city, String street, String number, Position position, String country) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.position = position;
        this.country = country;
    }

    //region getters en setters

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //endregion
}
