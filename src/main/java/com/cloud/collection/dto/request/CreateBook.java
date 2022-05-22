package com.cloud.collection.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString
public class CreateBook extends BaseCreateItem{
    private String author;
    private String printEdition;
    private Integer publishYear;
    private String publisher;
    private String illustrator;
    private String volume;
    private List<String> genres;
    private Boolean isDigital;
    private String format;
    private String ISBN;
}
