package org.example.library;

import org.example.member.IUser;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<AbstractLibraryItem> libraryItems;
    private List<IUser> users;

    public LibrarySystem() {
        this.libraryItems = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addLibraryItem(AbstractLibraryItem item) {
        libraryItems.add(item);
    }

    public List<AbstractLibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void addMember(IUser user) {
        users.add(user);
    }

    public List<IUser> getUsers() {
        return users;
    }

    public boolean borrowItem(IUser user, AbstractLibraryItem item) {
        return user.borrowItem(item);
    }

    public void returnItem(IUser user, AbstractLibraryItem item) {
        user.returnItem(item);
    }
}