package kdg.payment;

import kdg.order.Order;
import kdg.person.Partner;

import java.time.LocalDateTime;

public class TransferPayment extends Payment {
    private Partner partner;

    private Order[] orders;

    public TransferPayment(LocalDateTime time, String detail, Money bedrag, Partner partner, Order[] orders) {
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

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    //endregion
}
