package be.kdg.order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public List<Order> geefOrders() {
        orders = new ArrayList<>();
        for (Order order : orders) {
            order.getOrderStateEvents()
                    .forEach(orderStateEvent -> orderStateEvent.getState() == OrderState.ORDER_PLACED);
        }
        return orders;
    }
}
