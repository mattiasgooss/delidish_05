package be.kdg.ui;

import be.kdg.order.Order;
import be.kdg.person.Courier;

import java.util.List;

public class DeliDishController {
    private String userId;

    private Courier courier;

    private List<Order> beschikbareLeveringen;

    public List<Order> geefBeschikbareLeveringen(){

        //beschikbareLeveringen = getBeschikbareLeveringen();

        return beschikbareLeveringen;
    }
}
