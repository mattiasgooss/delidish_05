package be.kdg.payment;

import be.kdg.order.Order;
import be.kdg.person.Partner;

import java.time.LocalDateTime;
import java.util.List;

public class TransferPayment extends Payment {
    private Partner partner;

    private List<Order> orders;

    public TransferPayment(LocalDateTime time, String detail, Money bedrag, Partner partner, List<Order> orders) {
        super(time, detail, bedrag);
        this.partner = partner;
        this.orders = orders;
    }

    //region getters en setters

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    //endregion
}
