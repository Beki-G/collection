package com.cloud.collection.models.enums.item;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ItemType {
    BOOK(Types.BOOK),
    MOVIE(Types.MOVIE),
    SHOW(Types.SHOW),
    ANIME(Types.ANIME),
    FIGURINE(Types.FIGURINE),
//    CLOTHES("Clothes"),
//    SHOES("Shoes"),
//    JEWELRY("Jewelry"),
//    COINS("Coins"),
    OTHER(Types.OTHER);

    public final String type;

    public static final class Types{
        public static final String BOOK = "book";
        public static final String MOVIE = "movie";
        public static final String SHOW = "show";
        public static final String ANIME = "anime";
        public static final String FIGURINE = "figurine";
//        public static final String CLOTHES = "clothes";
//        public static final String SHOES = "Shoes";
//        public static final String JEWELRY = "jewelry";
//        public static final String COINS = "coins";
        public static final String OTHER = "other";
    }
}
