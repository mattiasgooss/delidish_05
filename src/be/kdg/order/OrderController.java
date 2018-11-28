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

    private Position p2;

    private Courier courier;

    private List<Order> orders;

    public List<Order> geefBeschikbareLeveringen(Courier courier){
        p2 = courier.getCurrentPosition();
        orders = orderManager.geefRecentGeplaatsteOrders(p2);

        return orders;
    }
}
