package com.cloud.collection.models.item;

import com.cloud.collection.models.enums.Genres;
import com.cloud.collection.models.enums.item.ItemType;
import com.cloud.collection.models.item.generic.Item;
import lombok.*;
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
@ToString
@DiscriminatorValue(ItemType.Types.BOOK)
public class Book extends Item {
    private String author;
    private String printEdition;
    private Integer publishYear;
    private String publisher;
    private String illustrator;
    private String volume;
    @ElementCollection
    private Set<Genres> genres;
    private Boolean isDigital;
    private String format;
    private String ISBN;
}
