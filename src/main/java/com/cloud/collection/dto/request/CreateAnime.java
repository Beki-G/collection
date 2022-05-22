package com.cloud.collection.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CreateAnime extends BaseCreateItem{
    public String season;
    public String format;
    public String animators;
    private String premierAirDate;
    private String finalAirDate;
}
