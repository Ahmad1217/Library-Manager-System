package org.example.library;

import java.util.Calendar;
import java.util.UUID;

public class MagazineItem extends AbstractLibraryItem {
    private String issue;

    public MagazineItem(String id, String issue) {
        super(id);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    @Override
    public void borrowItem(UUID userId) {
        this.available = false;
        this.borrowedBy = userId;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_YEAR, 2);
        this.dueToDate = cal.getTime();
    }
}