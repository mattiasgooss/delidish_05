package be.kdg.restaurant;

import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants;

    public RestaurantManager(List<Restaurant> restaurants) {
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
