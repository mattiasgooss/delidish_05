package be.kdg.restaurant;

import be.kdg.common.Position;

import java.util.List;

public class RestaurantManager {

    private List<Restaurant> restaurants;

    public RestaurantManager() {
        this.restaurants = restaurants;
    }

    public Restaurant geefRestaurant(Dish dish) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.equals(dish.getRestaurant()))
                return restaurant;
        }
        return null;
    }
}
