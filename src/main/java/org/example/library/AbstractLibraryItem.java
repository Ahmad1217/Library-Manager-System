package org.example.library;

import java.util.Date;
import java.util.UUID;

public abstract class AbstractLibraryItem {
    protected String id;
    protected boolean available;
    protected Date dueToDate;
    protected UUID borrowedBy;

    public AbstractLibraryItem(String id) {
        this.id = id;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public abstract void borrowItem(UUID userId);

    public void returnItem() {
        this.available = true;
        this.dueToDate = null;
        this.borrowedBy = null;
    }
}