package com.cloud.collection.exception.notfound;

import com.cloud.collection.exception.NotFoundException;

public class ItemNotFoundException extends NotFoundException {
    public ItemNotFoundException(){ super("Item does not exist.");}
}
