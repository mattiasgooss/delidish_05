package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.distanceAPI.DistanceCalculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    private OrderLineManager orderLineManager;

    private DistanceCalculator distanceCalculator;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    private Collection<Order> recenteOrders;

    private List<Order> geplaatsteOrders;


    public List<Order> geefRecentGeplaatsteOrders(Position p){
        for (Order order : orders) {
            OrderLine ol = orderLineManager.geefOrderLines(order);
        }
        return orders;
    }
}
