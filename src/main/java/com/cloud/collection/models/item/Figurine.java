package com.cloud.collection.models.item;

import com.cloud.collection.models.enums.item.ItemType;
import com.cloud.collection.models.item.generic.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue(ItemType.Types.FIGURINE)
public class Figurine extends Item {
    private Double height;
    private Double width;
    private Double length;
    /**
     * Weights will be saved in lbs
     */
    private Double weight;
    private Boolean officialMerch;

}
