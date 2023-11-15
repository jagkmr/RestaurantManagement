package com.example.demo.models;

import lombok.Data;

@Data
public class Item {
    String name;
    boolean isVeg;
    double itemPrice;
    int processingTime;
}
