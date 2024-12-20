package org.example.member;

import org.example.library.AbstractLibraryItem;

public class FacultyUser extends BaseUser {
    public FacultyUser(String name) {
        super(name, 5);
    }

    @Override
    public boolean borrowItem(AbstractLibraryItem item) {
        if (borrowedItems.size() < borrowLimit && item.isAvailable()) {
            borrowedItems.add(item);
            item.borrowItem(this.id);
            return true;
        }
        return false;
    }
}