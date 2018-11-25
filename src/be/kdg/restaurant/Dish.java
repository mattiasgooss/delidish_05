package be.kdg.restaurant;

import be.kdg.order.OrderLine;
import be.kdg.payment.Money;

import java.util.List;

public class Dish {
    private String name;
    private String description;
    private Money price;
    private int productionTime;
    private int maximumDeliveryTime;
    private List<Allergen> allergens;

    private Restaurant restaurant;

    private List<OrderLine> orderLines;

    public Dish(String name, String description, Money price, int productionTime, int maximumDeliveryTime, List<Allergen> allergens, Restaurant restaurant, List<OrderLine> orderLines) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productionTime = productionTime;
        this.maximumDeliveryTime = maximumDeliveryTime;
        this.allergens = allergens;
        this.restaurant = restaurant;
        this.orderLines = orderLines;
    }

    //region getters en setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public int getMaximumDeliveryTime() {
        return maximumDeliveryTime;
    }

    public void setMaximumDeliveryTime(int maximumDeliveryTime) {
        this.maximumDeliveryTime = maximumDeliveryTime;
    }

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    //endregion
}
