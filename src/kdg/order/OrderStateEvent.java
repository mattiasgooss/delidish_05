package kdg.order;

import kdg.person.DeliveryPointEvent;

import java.time.LocalDateTime;

public class OrderStateEvent {
    private LocalDateTime time;
    private OrderState state;
    private String remark;

    private DeliveryPointEvent deliveryPointEvent;

    private Order order;

    public OrderStateEvent(LocalDateTime time, OrderState state, String remark, DeliveryPointEvent deliveryPointEvent, Order order) {
        this.time = time;
        this.state = state;
        this.remark = remark;
        this.deliveryPointEvent = deliveryPointEvent;
        this.order = order;
    }

    //region getters en setters

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DeliveryPointEvent getDeliveryPointEvent() {
        return deliveryPointEvent;
    }

    public void setDeliveryPointEvent(DeliveryPointEvent deliveryPointEvent) {
        this.deliveryPointEvent = deliveryPointEvent;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

//endregion
}
