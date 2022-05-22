package com.cloud.collection.controllers.generic;

import com.cloud.collection.models.item.generic.Item;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface ItemGenericController<T extends Item> {

    Optional<T> findByItemName(@PathVariable String itemName);

    Optional<T> findById(@PathVariable Long itemId) ;

    Boolean deleteById(@PathVariable Long itemId) ;

}
