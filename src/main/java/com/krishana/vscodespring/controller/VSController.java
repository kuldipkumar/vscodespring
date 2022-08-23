package com.krishana.vscodespring.controller;

import com.krishana.vscodespring.entity.Item;
import com.krishana.vscodespring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class VSController {


    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public String entry(){
        return "This SpringBoot is running on VSCode";
    }

    @RequestMapping("/items")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Item> items() {
        return (List<Item>) itemRepository.findAll();
    }

    @PostMapping(path = "item", consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:3000")
    public String saveItem(@RequestBody Item item) {
        itemRepository.save(item);
        return "Item saved successfully";
    }
}
