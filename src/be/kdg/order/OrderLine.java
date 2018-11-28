package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.restaurant.Dish;
import be.kdg.restaurant.Restaurant;

public class OrderLine {
    private int quantity;
    private String remark;

    private Order order;

    private Dish dish;

    public OrderLine(int quantity, String remark, Order order, Dish dish) {
        this.quantity = quantity;
        this.remark = remark;
        this.order = order;
        this.dish = dish;
    }

    //region getters en setters

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }



    //endregion
}
