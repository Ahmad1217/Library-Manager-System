package org.example.member;

import org.example.library.AbstractLibraryItem;

public class StudentUser extends BaseUser {
    public StudentUser(String name) {
        super(name, 3);
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