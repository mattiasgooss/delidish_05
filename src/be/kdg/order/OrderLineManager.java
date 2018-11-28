package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.restaurant.Dish;
import be.kdg.restaurant.Restaurant;
import be.kdg.restaurant.RestaurantManager;

import java.util.List;

public class OrderLineManager {
    private List<OrderLine> orderLines;

    private RestaurantManager restaurantManager;

    private Order order;

    public OrderLineManager(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public OrderLine geefEersteOrderLine(Order order){
        OrderLine ol = order.getOrderLines().get(0);
        Dish d = ol.getDish();
        Restaurant r = restaurantManager.geefRestaurant(d);
        Position p1 = r.getContactInfo().getAddress().getPosition();
    }

    public OrderLine geefOrderLines(Order order){
        OrderLine ol = geefEersteOrderLine(order);

        return ol;
    }
}
