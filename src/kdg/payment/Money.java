package kdg.payment;

public class Money {
    private enum currency {EURO, DOLLAR}
    private float quantity;

    public Money(float quantity) {
        this.quantity = quantity;
    }

    //region getters en setters

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    //endregion
}
