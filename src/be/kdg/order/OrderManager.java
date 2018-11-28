package be.kdg.order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> geplaatsteOrders;

    private OrderLineManager orderLineManager;

    public OrderManager(List<Order> geplaatsteOrders) {
        this.geplaatsteOrders = geplaatsteOrders;
    }

    private List<Order> recenteOrders;

    public List<Order> geefRecentGeplaatsteOrders(){

        // geeft de maximum productiontime van de geplaatste orders
        for (Order order : geplaatsteOrders) {
            int mpt = orderLineManager.geefMaxProductionTime(order);
        }

        recenteOrders = new ArrayList<>();
        recenteOrders.addAll(geplaatsteOrders);
        return recenteOrders;
    }

    public Order geefOrder(int i){
        return geplaatsteOrders.get(i);
    }


}
