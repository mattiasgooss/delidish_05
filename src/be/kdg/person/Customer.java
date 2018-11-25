package be.kdg.person;

import be.kdg.common.*;
import be.kdg.order.Order;

import java.util.List;

public class Customer extends Person {
    private List<Address> deliveryAddresses;

    private List<Order> orders;

    public Customer(ContactInfo contactInfo, String firstName, String lastName, List<Address> deliveryAddresses, List<Order> orders) {
        super(contactInfo, firstName, lastName);
        this.deliveryAddresses = deliveryAddresses;
        this.orders = orders;
    }

    //region getters en setters

    public List<Address> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(List<Address> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    //endregion
}
