package com.example.demo.models;

import lombok.Data;



@Data
public class Restaurant {

    String name;
    String pinCode;
    Menu menu;
    int processingCapacity; // no of items that can be served in an hour


}
