package kdg.person;

import kdg.common.*;
import kdg.order.Order;

public class Courier extends Person {
    private boolean isAvailable;
    private Position currentPosition;

    private Partner partner;

    private DeliveryPointEvent[] deliveryPointEvents;

    private Order[] orders;

    public Courier(ContactInfo contactInfo, String firstName, String lastName, boolean isAvailable, Position currentPosition, Partner partner, DeliveryPointEvent[] deliveryPointEvents, Order[] orders) {
        super(contactInfo, firstName, lastName);
        this.isAvailable = isAvailable;
        this.currentPosition = currentPosition;
        this.partner = partner;
        this.deliveryPointEvents = deliveryPointEvents;
        this.orders = orders;
    }

    //region getters en setters

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public DeliveryPointEvent[] getDeliveryPointEvents() {
        return deliveryPointEvents;
    }

    public void setDeliveryPointEvents(DeliveryPointEvent[] deliveryPointEvents) {
        this.deliveryPointEvents = deliveryPointEvents;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    //endregion
}
