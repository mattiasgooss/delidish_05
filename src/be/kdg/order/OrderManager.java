package be.kdg.order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public List<Order> geefOrders() {
        ArrayList<Order> orderArrayList = new ArrayList<>();
        for (Order order : orders) {
            int size = order.getOrderStateEvents().size();
            OrderState os = order.getOrderStateEvents().get(0).getState();
            if(size == 1 && os.equals("ORDER_PLACED"))
                orderArrayList.add(order);
        }
        return orderArrayList;
    }
}
