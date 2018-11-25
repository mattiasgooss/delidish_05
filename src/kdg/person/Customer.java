package kdg.person;

import kdg.common.*;
import kdg.order.Order;

public class Customer extends Person {
    private Address[] deliveryAddresses;

    private Order[] orders;

    public Customer(ContactInfo contactInfo, String firstName, String lastName, Address[] deliveryAddresses, Order[] orders) {
        super(contactInfo, firstName, lastName);
        this.deliveryAddresses = deliveryAddresses;
        this.orders = orders;
    }

    //region getters en setters

    public Address[] getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(Address[] deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    //endregion
}
