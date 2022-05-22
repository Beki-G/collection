package com.cloud.collection.models.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum UserType {
    ADMINISTRATOR(Types.ADMINISTRATOR),
    USER(Types.USER);

    private final String type;

    public static final class Types {
        public static final String ADMINISTRATOR = "administrator";
        public static final String USER = "user";
    }
}
