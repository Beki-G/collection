package com.cloud.collection.service.generic;

import com.cloud.collection.models.item.generic.Item;

import java.util.Optional;

public interface ItemGenericService<T extends Item> {


    Optional<T> findByName(String name) throws Exception;

    T findById(Long itemId);

    Boolean deleteById(Long itemid) throws Exception;

    T save(T itemInfo) throws Exception;
}
