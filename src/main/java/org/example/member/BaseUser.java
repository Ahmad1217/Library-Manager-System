package org.example.member;

import org.example.library.AbstractLibraryItem;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BaseUser implements IUser {
    protected UUID id;
    protected String name;
    protected int borrowLimit;
    protected List<AbstractLibraryItem> borrowedItems;

    public BaseUser(String name, int limit) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.borrowLimit = limit;
        this.borrowedItems = new ArrayList<>();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public void returnItem(AbstractLibraryItem item) {
        borrowedItems.remove(item);
        item.returnItem();
    }
}