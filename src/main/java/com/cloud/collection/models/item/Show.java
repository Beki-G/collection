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
@DiscriminatorValue(ItemType.Types.SHOW)
public class Show extends Item {
    public Integer season;
    public String airDate;
    public String format;
}
