package be.kdg.restaurant;

import be.kdg.common.ContactInfo;
import be.kdg.person.Partner;

import java.util.List;

public class Restaurant {
    private int restoID;
    private String name;
    private ContactInfo contactInfo;

    private List<OpeningPeriod> openingPeriods;

    private List<Dish> dishes;

    private Partner partner;

    public Restaurant(int restoID, String name, ContactInfo contactInfo, List<OpeningPeriod> openingPeriods, List<Dish> dishes, Partner partner) {
        this.restoID = restoID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.openingPeriods = openingPeriods;
        this.dishes = dishes;
        this.partner = partner;
    }

    //region getters en setters

    public int getRestoID() {
        return restoID;
    }

    public void setRestoID(int restoID) {
        this.restoID = restoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<OpeningPeriod> getOpeningPeriods() {
        return openingPeriods;
    }

    public void setOpeningPeriods(List<OpeningPeriod> openingPeriods) {
        this.openingPeriods = openingPeriods;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    //endregion
}
