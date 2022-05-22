package com.cloud.collection.controllers.generic.impl;

import com.cloud.collection.controllers.generic.ItemGenericController;
import com.cloud.collection.models.item.generic.Item;
import com.cloud.collection.service.generic.ItemGenericService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class ItemGenericControllerImpl<T extends Item> implements ItemGenericController<T> {
    @Autowired
    ItemGenericService<T> genericService;

    Logger log = LogManager.getLogger(ItemGenericControllerImpl.class);

    @Override
    @GetMapping("/{itemName}")
    public Optional<T> findByItemName(@PathVariable String itemName){
        try {
            return genericService.findByName(itemName);
        }catch(Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    @GetMapping("/id/{itemId}")
    public T findById(@PathVariable Long itemId) {
        return genericService.findById(itemId);
    }

    @Override
    @DeleteMapping("/{itemId}")
    public Boolean deleteById(@PathVariable Long itemId){
        try{
            return genericService.deleteById(itemId);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
