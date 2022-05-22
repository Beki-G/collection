package com.cloud.collection.models.enums.item;

public enum ItemRarity {
    EXTREMELY_RARE("Extremely Rare"),
    RARE("Rare"),
    UNCOMMON("Uncommon"),
    COMMON("Common");

    private final String rarity;

    private ItemRarity(String rarity){
        this.rarity =  rarity;
    }
}
