package com.example.demo.interfaces;

public interface DaoAccessor<T, R> {

    void add(T var1);
    boolean update(T var1);
    boolean delete(R id);
    T get(R id);
}
