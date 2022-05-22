package com.cloud.collection.models.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CollectionStatus {
    COLLECTING("Collecting"),
    STOPPED("Stopped"),
    HIATUS("Hiatus"),
    COMPLETE("Complete");

    public final String status;
}
