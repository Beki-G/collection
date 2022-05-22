package com.cloud.collection.models;

import com.cloud.collection.models.enums.CollectionStatus;
import com.cloud.collection.models.item.generic.Item;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;
    public String createdDate;
    public String modifiedOn;
    public Double monetaryValue;
    public CollectionStatus status;
    @ManyToMany
    public Set<Item> items;
    @ManyToMany
    public Set<Series> series;
    public Boolean personal;
}
