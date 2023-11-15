package com.example.demo.services;

import com.example.demo.models.Order;
import com.example.demo.models.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantOrderManager {

    Map<Restaurant, Map<Integer, Order>> restaurantOrderMap = new HashMap();
    Map<Restaurant, Integer> currentRestaurantProcessing = new HashMap<>();

    boolean addOrder(Restaurant restaurant, Order order){
        Map<Integer, Order> orderMap = restaurantOrderMap.getOrDefault(restaurant, new HashMap<>());
        orderMap.put(order.getOrderNo(), order);

        Integer currentOrderProcessingTime = order.getItems().stream().map(customerOrderedItem -> customerOrderedItem.getItem().getProcessingTime()).reduce(0, Integer::sum);
        order.setProcessingTime(currentOrderProcessingTime);

        if (currentOrderProcessingTime + currentRestaurantProcessing.getOrDefault(restaurant, 0) <= restaurant.getProcessingCapacity()){
            Integer integer = currentRestaurantProcessing.getOrDefault(restaurant, 0);
            currentRestaurantProcessing.put(restaurant, integer + currentOrderProcessingTime);
            return true;
        }
        return false;
    }

    void orderCompleted(Restaurant restaurant, Order order){
        Integer integer = currentRestaurantProcessing.get(restaurant);
        currentRestaurantProcessing.put(restaurant, integer-order.getProcessingTime());
    }



}
