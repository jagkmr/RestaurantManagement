package com.example.demo.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Order {
    String customerName;
    String billNo;
    String address;
    String phoneNo;
    double totalAmount;
    int orderNo;
    int processingTime;
    List<CustomerOrderedItem> items = new ArrayList<>();


}
