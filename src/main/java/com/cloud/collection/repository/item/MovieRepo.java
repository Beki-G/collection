package com.cloud.collection.repository.item;

import com.cloud.collection.models.item.Movie;
import com.cloud.collection.repository.item.generic.ItemGenericRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends ItemGenericRepo<Movie> {
}
