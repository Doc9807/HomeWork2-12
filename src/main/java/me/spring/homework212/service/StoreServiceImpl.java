package me.spring.homework212.service;

import me.spring.homework212.model.Item;
import me.spring.homework212.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Long> itemIds) {
        basket.addAll(itemIds.stream()
                .map(Item::new)
                .toList());
    }

    @Override
    public List<Item> get() {
        return basket.getAll();
    }
}
