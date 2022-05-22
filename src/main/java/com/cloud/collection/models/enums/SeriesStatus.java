package com.cloud.collection.models.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SeriesStatus {
    ONGOING("Ongoing"),
    HIATUS("Hiatus"),
    COMPLETE("Complete"),
    DROPPED("Dropped");

    public final String status;
}
