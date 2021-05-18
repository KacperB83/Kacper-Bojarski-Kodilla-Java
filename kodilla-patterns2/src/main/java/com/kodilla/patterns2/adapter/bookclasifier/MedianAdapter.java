package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book: bookSet) {
            books.put(new BookSignature(book.getSignature()),
                    new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
