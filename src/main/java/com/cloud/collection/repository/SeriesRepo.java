package com.cloud.collection.repository;

import com.cloud.collection.models.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepo extends JpaRepository<Series, Long> {
}
