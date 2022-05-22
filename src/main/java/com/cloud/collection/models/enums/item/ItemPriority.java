package com.cloud.collection.models.enums.item;

public enum ItemPriority {
    HIGHEST("Highest"),
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low"),
    LOWEST("Lowest");

    public final String priority;

    private ItemPriority(String priority) { this.priority = priority; }
}
