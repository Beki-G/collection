package com.cloud.collection.dto.request;

import com.cloud.collection.models.enums.item.ItemCondition;
import com.cloud.collection.models.enums.item.ItemPriority;
import com.cloud.collection.models.enums.item.ItemRarity;
import com.cloud.collection.models.enums.item.ItemType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseCreateItem{
    public String name;
    public String dateAcquired;
    public String dateCreated;
    public String dateModified;
    public Double purchaseValue;
    public Double monetaryValue;
    public ItemCondition itemCondition;
    public String description;
    public Boolean replaceable;
    public ItemRarity rarity;
    public Set<String> imageLinks;
    public String edition;
    public ItemType type;
    public ItemPriority priority;
    public Set<String> tags;
    public Long userId;
}
