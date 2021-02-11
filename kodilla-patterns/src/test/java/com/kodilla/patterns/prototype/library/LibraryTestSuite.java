package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    private static Book book;

    @Test
    void testGetBooks() {
        //Given
        Library library1 = new Library("Example book set 1");
        library1.getBooks().add(new Book("Dylan Murphy", "Wolf of the mountains", LocalDate.of(2003, 2, 11)));
        library1.getBooks().add(new Book("Phoebe Pearson", "Slaves of dreams", LocalDate.of(2012, 2, 2)));
        library1.getBooks().add(new Book("Morgan Walsh", "Obliteration of heaven", LocalDate.of(2001, 3, 6)));
        library1.getBooks().add(new Book("Aimee Murphy", "Rejecting the night", LocalDate.of(2015, 2, 2)));

        // swallow clone of Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.swallowCopy();
            clonedLibrary.setName("Example book set 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("Example book set 3");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library1);
        System.out.println(clonedLibrary);

        //When
        Book bookToRemove = new Book("Morgan Walsh", "Obliteration of heaven", LocalDate.of(2001, 3, 6));
        library1.getBooks().remove(bookToRemove);

        //Then
        System.out.println(library1);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library1.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library1.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library1.getBooks());

    }
}
