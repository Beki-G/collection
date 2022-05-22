package com.cloud.collection.models.item.generic;

import com.cloud.collection.models.Image;
import com.cloud.collection.models.Tag;
import com.cloud.collection.models.enums.item.ItemCondition;
import com.cloud.collection.models.enums.item.ItemPriority;
import com.cloud.collection.models.enums.item.ItemRarity;
import com.cloud.collection.models.enums.item.ItemType;
import com.cloud.collection.models.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@SuperBuilder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    /**
     * Date which the item was acquired by the user
     */
    public String dateAcquired;
    /**
     * Date which the item was created in database
     */
    public String dateCreated;
    /**
     * Date of item object modified
     */
    public String dateModified;
    /**
     * Amount for which the item was purchased
     */
    public Double purchaseValue;
    /**
     * Amount item is valued at
     */
    public Double monetaryValue;
    @Enumerated(EnumType.STRING)
    public ItemCondition itemCondition;
    public String description;
    public Boolean replaceable;
    @Enumerated(EnumType.STRING)
    public ItemRarity rarity;
    @OneToMany
    public Set<Image> images;
    public String edition;
    @Enumerated(EnumType.STRING)
    public ItemType type;
    @Enumerated(EnumType.STRING)
    public ItemPriority priority;
    @ManyToMany
    public Set<Tag> tags;
    @ManyToOne(fetch = FetchType.LAZY)
    public User owner;
}
