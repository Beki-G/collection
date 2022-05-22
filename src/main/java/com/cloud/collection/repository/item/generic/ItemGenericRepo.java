package com.cloud.collection.repository.item.generic;

import com.cloud.collection.models.item.generic.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemGenericRepo<T extends Item> extends JpaRepository<T, Long> {
    Optional<T> findByName(String name);
}
