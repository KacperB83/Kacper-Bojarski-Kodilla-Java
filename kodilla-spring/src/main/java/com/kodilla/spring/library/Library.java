package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

//@Service
public final class Library {

    private final List<String> books = new ArrayList<>();
   /* @Autowired*/
    private LibraryDbController libraryDbController;

    //@Autowired
    /*public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
    public Library() {
        //do nothing
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
