package org.example.member;

import org.example.library.AbstractLibraryItem;
import java.util.UUID;

public interface IUser {
    UUID getId();
    String getInfo();
    boolean borrowItem(AbstractLibraryItem item);
    void returnItem(AbstractLibraryItem item);
}