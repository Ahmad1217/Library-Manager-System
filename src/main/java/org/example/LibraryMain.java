package org.example;

import org.example.library.LibrarySystem;
import org.example.library.BookItem;
import org.example.library.MagazineItem;
import org.example.member.FacultyUser;
import org.example.member.StudentUser;
import org.example.member.GuestUser;
import org.example.member.IUser;

import javax.swing.*;

public class LibraryMain {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();

        librarySystem.addLibraryItem(new BookItem("A2030", "Java Programming"));
        librarySystem.addLibraryItem(new MagazineItem("TY", "Tech Yearly"));

        IUser faculty = new FacultyUser("Matti Tuomaala");
        IUser student = new StudentUser("Ahmad Husnain");
        IUser guest = new GuestUser("Guest");

        librarySystem.addMember(faculty);
        librarySystem.addMember(student);
        librarySystem.addMember(guest);

        librarySystem.borrowItem(faculty, librarySystem.getLibraryItems().get(0)); // Faculty borrows Book
        librarySystem.borrowItem(student, librarySystem.getLibraryItems().get(1)); // Student borrows Magazine

        SwingUtilities.invokeLater(() ->
            System.out.println("Library system updated.")
        );
    }
}