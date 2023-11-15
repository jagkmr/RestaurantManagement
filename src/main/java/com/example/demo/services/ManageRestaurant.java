package com.example.demo.services;

import com.example.demo.dao.MenuDao;
import com.example.demo.dao.RestaurantDao;
import com.example.demo.models.Menu;
import com.example.demo.models.Restaurant;

public class ManageRestaurant {

    RestaurantDao restaurantDao = new RestaurantDao();
    public Restaurant createRestaurant(Restaurant restaurant){
        restaurantDao.add(restaurant);
        return restaurant;
    }

    void updateRestaurant(Restaurant restaurant){

    }

    public void changeMenu(Restaurant restaurant, Menu menu){
        Restaurant restaurant1 = restaurantDao.get(restaurant.getName());
        restaurant1.setMenu(menu);
    }






}
