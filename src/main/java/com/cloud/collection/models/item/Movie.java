package com.cloud.collection.models.item;

import com.cloud.collection.models.enums.Genres;
import com.cloud.collection.models.enums.item.ItemType;
import com.cloud.collection.models.item.generic.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue(ItemType.Types.MOVIE)
public class Movie extends Item {
    private String director;
    private String studio;
    private Integer yearReleased;
    private String language;
    private String format;
    @ElementCollection
    private Set<Genres> genres;
    @ElementCollection
    private Set<String> actors;
}
