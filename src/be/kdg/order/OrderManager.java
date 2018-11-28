package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.distanceAPI.DistanceCalculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderManager {
    private List<Order> geplaatsteOrders;

    private OrderLineManager orderLineManager;

    private DistanceCalculator distanceCalculator;

    public OrderManager() {
        this.geplaatsteOrders = new ArrayList<>();
    }

    private Collection<Order> recenteOrders;

    public List<Order> geefRecentGeplaatsteOrders(Position p){
        for (Order order : geplaatsteOrders) {
            OrderLine ol = orderLineManager.geefOrderLines(order);


        }
        return geplaatsteOrders;
    }
}
