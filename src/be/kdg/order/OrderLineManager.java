package be.kdg.order;

import be.kdg.restaurant.Dish;
import be.kdg.restaurant.Restaurant;
import be.kdg.restaurant.RestaurantManager;

import java.util.List;

public class OrderLineManager {
    private List<OrderLine> orderLines;

    private int mpt ;

    RestaurantManager restaurantManager = new RestaurantManager();


    public OrderLineManager(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public OrderLine geefEersteOrderLine(Order order){
        OrderLine ol = geefOrderLines(order).get(0);
        Dish d = ol.getDish();

        Restaurant r = restaurantManager.geefRestaurant(d);
        return ol;
    }

    public List<OrderLine> geefOrderLines(Order order){
        List<OrderLine> olis = order.getOrderLines();


        return olis;
    }

    public int geefMaxProductionTime(Order order){
        mpt = 0;
        List<OrderLine> olis = order.getOrderLines();
        for (OrderLine oli : olis) {
            Dish di = oli.getDish();
            int pt = di.getProductionTime();
            if (pt > mpt)
                mpt = pt;
        }
        return mpt;
    }
}
