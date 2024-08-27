package me.spring.homework212.service;

import me.spring.homework212.model.Item;

import java.util.List;

public interface StoreService {

    void add(List<Long> itemIds);

    List<Item> get();
}
