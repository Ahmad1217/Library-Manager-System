package org.example.library;

import java.util.Calendar;
import java.util.UUID;

public class BookItem extends AbstractLibraryItem {
    private String title;

    public BookItem(String id, String title) {
        super(id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrowItem(UUID userId) {
        this.available = false;
        this.borrowedBy = userId;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_YEAR, 4);
        this.dueToDate = cal.getTime();
    }
}