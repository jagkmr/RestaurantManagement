package com.example.demo.models;

import lombok.Data;

@Data
public class CustomerOrderedItem {
    Item item;
    int quantity;
    String description;
}
