package com.cloud.collection.models.enums.item;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ItemCondition {
    MINT(Conditions.MINT),
    EXCELLENT(Conditions.EXCELLENT),
    LIKENEW(Conditions.LIKENEW),
    GOOD(Conditions.GOOD),
    FAIR(Conditions.FAIR),
    POOR(Conditions.POOR),
    BAD(Conditions.BAD),
    PARTS(Conditions.PARTS);

    public final String condition;

    public static final class Conditions{
        public static final String MINT = "Mint";
        public static final String EXCELLENT= "Excellent";
        public static final String LIKENEW = "Like new";
        public static final String GOOD = "Good";
        public static final String FAIR = "Fair";
        public static final String POOR = "Poor";
        public static final String BAD = "Bad";
        public static final String PARTS = "Parts";
    }

}
