package org.example.member;

import org.example.library.AbstractLibraryItem;

public class GuestUser extends BaseUser {
    public GuestUser(String name) {
        super(name, 1);
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