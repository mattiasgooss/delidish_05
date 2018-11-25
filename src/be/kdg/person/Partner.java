package be.kdg.person;

import be.kdg.payment.TransferPayment;
import be.kdg.restaurant.Restaurant;

import java.util.List;

public class Partner {
    private String bankAccountNr;

    private Courier courier;

    private Restaurant restaurant;

    private List<TransferPayment> transferPayments;

    public Partner(String bankAccountNr, Courier courier, Restaurant restaurant, List<TransferPayment> transferPayments) {
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

    public List<TransferPayment> getTransferPayments() {
        return transferPayments;
    }

    public void setTransferPayments(List<TransferPayment> transferPayments) {
        this.transferPayments = transferPayments;
    }

    //endregion
}
