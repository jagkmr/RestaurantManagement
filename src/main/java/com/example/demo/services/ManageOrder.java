package com.example.demo.services;

import com.example.demo.models.CustomerOrderedItem;
import com.example.demo.models.Order;
import com.example.demo.models.Restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ManageOrder {

    Map<String, Restaurant> restaurants = new HashMap<>();

    private RestaurantOrderManager restaurantOrderManager = new RestaurantOrderManager();


    public Order createOrder(Restaurant restaurant){
        Order order = new Order();
        order.setOrderNo(new Random().nextInt());
        return order;
    }

    void deleteOrder(){

    }

    void addCustoemrOrderedItem(CustomerOrderedItem customerOrderedItem){

    }

    void removeCustomerOrderedItem(CustomerOrderedItem customerOrderedItem){

    }

    public boolean placeOrder(Restaurant restaurant, Order order){
        return restaurantOrderManager.addOrder(restaurant, order);
    }

    public boolean orderCompleted(Restaurant restaurant, Order order){
        restaurantOrderManager.orderCompleted(restaurant, order);
        return true;
    }
}
