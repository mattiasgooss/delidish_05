package be.kdg.person;

import java.time.LocalDateTime;

public class DeliveryPointEvent {
    private LocalDateTime time;
    private int points;
    private EventType eventType;

    private Courier courier;

    public DeliveryPointEvent(LocalDateTime time, int points, EventType eventType, Courier courier) {
        this.time = time;
        this.points = points;
        this.eventType = eventType;
        this.courier = courier;
    }

    //region getters en setters

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    //endregion
}
