package com.cloud.collection.service.generic.impl;

import com.cloud.collection.models.item.generic.Item;
import com.cloud.collection.repository.item.generic.ItemGenericRepo;
import com.cloud.collection.service.generic.ItemGenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RequiredArgsConstructor
public class ItemGenericServiceImpl <T extends Item> implements ItemGenericService<T> {

    @Autowired
    protected ItemGenericRepo<T> genericRepo;

    /**
     * Class <T> tupe of
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public Optional<T> findByName(String name) throws Exception {
        return genericRepo.findByName(name);
    }

    @Override
    public Optional<T> findById(Long itemId) throws Exception {
        return genericRepo.findById(itemId);
    }

    @Override
    public Boolean deleteById(Long itemid) throws Exception {
        Optional<T> item = genericRepo.findById(itemid);
        return item.isEmpty();
    }

    @Override
    public T save(T item) throws Exception {
        return genericRepo.save(item);
    }


}
