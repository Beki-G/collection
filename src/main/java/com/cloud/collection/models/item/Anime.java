package com.cloud.collection.models.item;

import com.cloud.collection.models.enums.item.ItemType;
import com.cloud.collection.models.item.generic.Item;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@DiscriminatorValue(ItemType.Types.ANIME)
public class Anime extends Item {
    private String season;
    private String format;
    private String animators;
    private String premierAirDate;
    private String finalAirDate;
}
