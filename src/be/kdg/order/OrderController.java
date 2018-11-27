package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.distanceAPI.DistanceCalculator;
import be.kdg.person.Courier;
import be.kdg.restaurant.RestaurantManager;

import java.util.List;

public class OrderController {
    private String userId;

    private DistanceCalculator distanceCalculator;

    private OrderManager orderManager;

    private Position courierPosition;

    private Courier courier;

    private List<Order> orders;

    private RestaurantManager restaurantManager;

    public Position getCourierPosition() {
        courierPosition = courier.getCurrentPosition();
        return courierPosition;
    }

    public List<Order> geefBeschikbareOrders(){
        return orders;
    }

    public double getDistance(){
        restaurantManager = new RestaurantManager();
        restaurantManager.
        return distanceCalculator.getDistance(courierPosition,);
    }
}
