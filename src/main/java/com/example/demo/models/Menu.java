package com.example.demo.models;


import java.util.ArrayList;
import java.util.List;

public class Menu  {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

}
