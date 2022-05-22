package com.cloud.collection.repository.item;

import com.cloud.collection.models.item.Figurine;
import com.cloud.collection.repository.item.generic.ItemGenericRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface FigurineRepo extends ItemGenericRepo<Figurine> {
}
