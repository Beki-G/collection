package com.cloud.collection.repository.item;

import com.cloud.collection.models.item.Anime;
import com.cloud.collection.repository.item.generic.ItemGenericRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepo extends ItemGenericRepo<Anime> {
}
