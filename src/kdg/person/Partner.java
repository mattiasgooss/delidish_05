package kdg.person;

import kdg.payment.TransferPayment;
import kdg.restaurant.Restaurant;

public class Partner {
    private String bankAccountNr;

    private Courier courier;

    private Restaurant restaurant;

    private TransferPayment[] transferPayments;

    public Partner(String bankAccountNr, Courier courier, Restaurant restaurant, TransferPayment[] transferPayments) {
        this.bankAccountNr = bankAccountNr;
        this.courier = courier;
        this.restaurant = restaurant;
        this.transferPayments = transferPayments;
    }

    //region getters en setters

    public String getBankAccountNr() {
        return bankAccountNr;
    }

    public void setBankAccountNr(String bankAccountNr) {
        this.bankAccountNr = bankAccountNr;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public TransferPayment[] getTransferPayments() {
        return transferPayments;
    }

    public void setTransferPayments(TransferPayment[] transferPayments) {
        this.transferPayments = transferPayments;
    }

    //endregion
}
