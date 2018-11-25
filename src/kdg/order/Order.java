package kdg.order;

import kdg.common.*;
import kdg.payment.DirectPayment;
import kdg.payment.TransferPayment;
import kdg.person.Courier;
import kdg.person.Customer;

public class Order {
    private int orderId;
    private Address deliveryAddress;
    private String deliveryInstructions;
    private int averageDeliveryPoints;

    private OrderStateEvent[] orderStateEvents;

    private Customer customer;

    private Courier courier;

    private TransferPayment transferPayment;

    private DirectPayment directPayment;

    public Order(int orderId, Address deliveryAddress, String deliveryInstructions, int averageDeliveryPoints, OrderStateEvent[] orderStateEvents, Customer customer, Courier courier, TransferPayment transferPayment, DirectPayment directPayment) {
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryInstructions = deliveryInstructions;
        this.averageDeliveryPoints = averageDeliveryPoints;
        this.orderStateEvents = orderStateEvents;
        this.customer = customer;
        this.courier = courier;
        this.transferPayment = transferPayment;
        this.directPayment = directPayment;
    }

    //region getters en setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public int getAverageDeliveryPoints() {
        return averageDeliveryPoints;
    }

    public void setAverageDeliveryPoints(int averageDeliveryPoints) {
        this.averageDeliveryPoints = averageDeliveryPoints;
    }

    public OrderStateEvent[] getOrderStateEvents() {
        return orderStateEvents;
    }

    public void setOrderStateEvents(OrderStateEvent[] orderStateEvents) {
        this.orderStateEvents = orderStateEvents;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public TransferPayment getTransferPayment() {
        return transferPayment;
    }

    public void setTransferPayment(TransferPayment transferPayment) {
        this.transferPayment = transferPayment;
    }

    public DirectPayment getDirectPayment() {
        return directPayment;
    }

    public void setDirectPayment(DirectPayment directPayment) {
        this.directPayment = directPayment;
    }

    //endregion
}
