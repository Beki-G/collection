package com.cloud.collection.models;

import com.cloud.collection.models.enums.CollectionStatus;
import com.cloud.collection.models.enums.SeriesStatus;
import com.cloud.collection.models.item.generic.Item;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public Integer year;
    public String description;
    @ManyToMany
    public Set<Tag> tags;
    @ManyToMany
    public Set<Item> items;
    public String coverImageId;
    public Boolean personal;
    @Enumerated(EnumType.STRING)
    public SeriesStatus seriesStatus;
    @Enumerated(EnumType.STRING)
    public CollectionStatus collectionStatus;
}
