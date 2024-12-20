package org.example.library;

import org.example.member.*;

public class LibraryMain {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();

        librarySystem.addLibraryItem(new BookItem("I1", "Introduction to Java"));
        librarySystem.addLibraryItem(new MagazineItem("MA1", "Tech Yearly"));

        IUser faculty = new FacultyUser("Matti");
        IUser student = new StudentUser("Ahmad");
        IUser guest = new GuestUser("Guest");

        librarySystem.addMember(faculty);
        librarySystem.addMember(student);
        librarySystem.addMember(guest);
        librarySystem.borrowItem(faculty, librarySystem.getLibraryItems().get(0));
        librarySystem.borrowItem(student, librarySystem.getLibraryItems().get(1));
    }
}