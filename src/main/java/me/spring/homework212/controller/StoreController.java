package me.spring.homework212.controller;

import me.spring.homework212.model.Item;
import me.spring.homework212.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("itemIds") List<Long> itemIds) {
        service.add(itemIds);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return service.get();
    }
}
