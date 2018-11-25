package kdg.restaurant;

import kdg.order.OrderLine;
import kdg.payment.Money;

public class Dish {
    private String name;
    private String description;
    private Money price;
    private int productionTime;
    private int maximumDeliveryTime;
    private Allergen[] allergens;

    private Restaurant restaurant;

    private OrderLine[] orderLines;

    public Dish(String name, String description, Money price, int productionTime, int maximumDeliveryTime, Allergen[] allergens, Restaurant restaurant, OrderLine[] orderLines) {
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

    public Allergen[] getAllergens() {
        return allergens;
    }

    public void setAllergens(Allergen[] allergens) {
        this.allergens = allergens;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public OrderLine[] getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(OrderLine[] orderLines) {
        this.orderLines = orderLines;
    }

    //endregion
}
