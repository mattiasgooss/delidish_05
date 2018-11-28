package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.distanceAPI.DistanceCalculator;
import be.kdg.person.Courier;

import java.util.List;

public class OrderController {
    private String userId;

    private DistanceCalculator distanceCalculator;

    private OrderManager orderManager;

    private OrderLineManager orderLineManager;

    private Position courierPosition;

    private Courier courier;

    private List<Order> orders;


    public Position getCourierPosition() {
        courierPosition = courier.getCurrentPosition();
        return courierPosition;
    }

    public List<Order> geefBeschikbareLeveringen(){
        orders = orderManager.geefOrders();
        for (Order order : orders) {
            orderLineManager.geefOrderLines(order);
        }
        return orders;
    }

    public double getDistance(){
        return distanceCalculator.getDistance( , courierPosition);
    }
}
