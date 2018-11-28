package be.kdg.order;

import be.kdg.common.Position;
import be.kdg.distanceAPI.DistanceCalculator;
import be.kdg.person.Courier;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderController {
    private String userId;

    private DistanceCalculator distanceCalculator;

    private OrderManager orderManager;

    private OrderLineManager orderLineManager;

    private Position p2;

    private Courier courier;

    private List<Order> geplaatsteOrders;

    private List<Order> recenteOrders;

    private List<OrderLine> orderLines;

    public List<Order> geefBeschikbareLeveringen(Courier courier) {
        p2 = courier.getCurrentPosition();
        orderManager = new OrderManager(geplaatsteOrders);
        recenteOrders = orderManager.geefRecentGeplaatsteOrders();
        List<Order> potentieleOrders = new ArrayList<>();
        for (int i = 0; i < recenteOrders.size(); i++) {
            Order opgehaaldeOrder = orderManager.geefOrder(i);
            OrderLineManager olm = new OrderLineManager(orderLines);
            OrderLine ol = orderLineManager.geefEersteOrderLine(opgehaaldeOrder);
            int productionTime = olm.geefMaxProductionTime(recenteOrders.get(i));
            Position p1 = ol.getDish().getRestaurant().getContactInfo().getAddress().getPosition();
            double distance = distanceCalculator.getDistance(p1,p2);
            LocalDateTime dtCourier = LocalDateTime.now();
            LocalDateTime dtBereiding = LocalDateTime.now();

            if (dtCourier.plusMinutes((long)distance*4).isBefore(dtBereiding.plusMinutes(productionTime))){
                potentieleOrders.add(recenteOrders.get(i));
            }
        }
        Collections.sort(potentieleOrders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Integer.compare(o1.getOrderId(), o2.getOrderId());
            }
        });
        List<Order> beschikbareOrders = new ArrayList<>();
        for (int i=0; i<3;i++){
            beschikbareOrders.add(potentieleOrders.get(i));
        }
        return beschikbareOrders;
    }
}
