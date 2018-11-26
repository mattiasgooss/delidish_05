package be.kdg.person;

import be.kdg.common.*;
import be.kdg.order.Order;
import be.kdg.ui.DeliDishApp;

import java.util.List;

public class Courier extends Person {
    private boolean isAvailable;
    private Position currentPosition;

    private Partner partner;

    private List<DeliveryPointEvent> deliveryPointEvents;

    private List<Order> orders;

    private DeliDishApp deliDishApp;

    public Courier(ContactInfo contactInfo, String firstName, String lastName, boolean isAvailable, Position currentPosition, Partner partner, List<DeliveryPointEvent> deliveryPointEvents, List<Order> orders) {
        super(contactInfo, firstName, lastName);
        this.isAvailable = isAvailable;
        this.currentPosition = currentPosition;
        this.partner = partner;
        this.deliveryPointEvents = deliveryPointEvents;
        this.orders = orders;
    }

    public List<Order> getBeschikbareLeveringen(){

        return orders;
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

    public List<DeliveryPointEvent> getDeliveryPointEvents() {
        return deliveryPointEvents;
    }

    public void setDeliveryPointEvents(List<DeliveryPointEvent> deliveryPointEvents) {
        this.deliveryPointEvents = deliveryPointEvents;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    //endregion
}
