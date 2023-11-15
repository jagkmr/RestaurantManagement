package com.example.demo;

import com.example.demo.models.*;
import com.example.demo.services.ManageOrder;
import com.example.demo.services.ManageRestaurant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;

public class DemoApplication {

	public static void main(String[] args) {

		// create new restaurant with processing capacity
		// createMenu and add items with its price

		Item item1 = new Item();
		item1.setItemPrice(10);
		item1.setName("milk");
		item1.setVeg(true);
		item1.setProcessingTime(10);

		Menu menu = new Menu();
		menu.addItem(item1);

		Restaurant restaurant = new Restaurant();
		restaurant.setName("res1");
		restaurant.setPinCode("24534");
		restaurant.setProcessingCapacity(30);
		restaurant.setMenu(menu);


		ManageRestaurant manageRestaurant = new ManageRestaurant();
		manageRestaurant.createRestaurant(restaurant);



		manageRestaurant.changeMenu(restaurant, menu);



		ManageOrder manageOrder = new ManageOrder();
		Order order = manageOrder.createOrder(restaurant);

		CustomerOrderedItem customerOrderedItem = new CustomerOrderedItem();
		customerOrderedItem.setItem(item1);
		customerOrderedItem.setQuantity(1);

		ArrayList orderedItems = new ArrayList();
		orderedItems.add(customerOrderedItem);
		order.setItems(orderedItems);

		boolean b = manageOrder.placeOrder(restaurant, order);
		if (b){
			System.out.println("order is placed");
		}
		else {
			System.out.println("order not placed");
		}

		// second order
		Order order1 = manageOrder.createOrder(restaurant);

		CustomerOrderedItem customerOrderedItem1 = new CustomerOrderedItem();
		item1.setProcessingTime(40);
		customerOrderedItem1.setItem(item1);
		customerOrderedItem1.setQuantity(3);

		ArrayList orderedItems1 = new ArrayList();
		orderedItems1.add(customerOrderedItem1);
		order1.setItems(orderedItems1);

		b = manageOrder.placeOrder(restaurant, order1);

		if (b){
			System.out.println("order is placed");
		}
		else {
			System.out.println("order not placed");
		}


		manageOrder.orderCompleted(restaurant, order);
	}
}
