package be.kdg.person;

import be.kdg.common.*;

public class Person {
    private ContactInfo contactInfo;
    private String firstName;
    private String lastName;

    Person(ContactInfo contactInfo, String firstName, String lastName) {
        this.contactInfo = contactInfo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //region getters en setters

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
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

    //endregion
}
