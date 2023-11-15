package com.example.demo.dao;

import com.example.demo.interfaces.DaoAccessor;
import com.example.demo.models.Item;
import com.example.demo.models.Menu;

public class MenuDao implements DaoAccessor<Menu, Long> {

    @Override
    public void add(Menu var1) {

    }

    @Override
    public boolean update(Menu var1) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Menu get(Long id) {
        return null;
    }
}
