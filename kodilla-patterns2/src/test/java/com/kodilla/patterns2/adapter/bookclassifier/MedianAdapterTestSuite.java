package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "200310"));
        books.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "201210"));
        books.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "200110"));
        books.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "201510"));

        MedianAdapter adapter = new MedianAdapter();
        //When
        int result = adapter.publicationYearMedian(books);
        System.out.println(result);
        //Then
        assertEquals(2007, result);
    }
}
