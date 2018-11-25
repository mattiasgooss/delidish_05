package be.kdg.payment;

import be.kdg.order.Order;

import java.time.LocalDateTime;

public class DirectPayment extends Payment {
    private String id;
    private enum paymentType {DEBET, CREDIT}

    private Order order;

    public DirectPayment(LocalDateTime time, String detail, Money bedrag, String id, Order order) {
        super(time, detail, bedrag);
        this.id = id;
        this.order = order;
    }

    //region getters en setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    //endregion
}
