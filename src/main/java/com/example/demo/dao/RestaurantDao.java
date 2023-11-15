package com.example.demo.dao;

import com.example.demo.interfaces.DaoAccessor;
import com.example.demo.models.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantDao implements DaoAccessor<Restaurant, String> {

    Map<String, Restaurant> restaurantMap = new HashMap<>();

    @Override
    public void add(Restaurant var1) {
        restaurantMap.put(var1.getName(), var1);

    }

    @Override
    public boolean update(Restaurant var1) {
        return false;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    @Override
    public Restaurant get(String  name) {
        return restaurantMap.get(name);
    }
}
