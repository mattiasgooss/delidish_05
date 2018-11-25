package be.kdg.restaurant;

import be.kdg.common.*;

public class OpeningPeriod {
    private DayOfWeek dayOfWeek;
    private Hour openingTime;
    private Hour closingTime;

    private Restaurant restaurant;

    public OpeningPeriod(DayOfWeek dayOfWeek, Hour openingTime, Hour closingTime, Restaurant restaurant) {
        this.dayOfWeek = dayOfWeek;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.restaurant = restaurant;
    }

    //region getters en setters

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Hour getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Hour openingTime) {
        this.openingTime = openingTime;
    }

    public Hour getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Hour closingTime) {
        this.closingTime = closingTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    //endregion
}
