package be.kdg.order;

import be.kdg.common.*;
import be.kdg.payment.DirectPayment;
import be.kdg.payment.TransferPayment;
import be.kdg.person.Courier;
import be.kdg.person.Customer;

import java.util.List;

public class Order {
    private int orderId;
    private Address deliveryAddress;
    private String deliveryInstructions;
    private int averageDeliveryPoints;

    private List<OrderLine> orderLines;

    private List<OrderStateEvent> orderStateEvents;

    private Customer customer;

    private Courier courier;

    private TransferPayment transferPayment;

    private DirectPayment directPayment;

    public Order(int orderId, Address deliveryAddress, String deliveryInstructions, int averageDeliveryPoints, List<OrderLine> orderLines, List<OrderStateEvent> orderStateEvents, Customer customer, Courier courier, TransferPayment transferPayment, DirectPayment directPayment) {
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryInstructions = deliveryInstructions;
        this.averageDeliveryPoints = averageDeliveryPoints;
        this.orderLines = orderLines;
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

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public List<OrderStateEvent> getOrderStateEvents() {
        return orderStateEvents;
    }

    public void setOrderStateEvents(List<OrderStateEvent> orderStateEvents) {
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
