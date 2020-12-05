package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {
    @Test
    void testReadFile() {
        //Giver
        FileReader fileReader = new FileReader();
        //When & Then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesnotExistsReadFileShouldThrowExcepition() {
        //Given
        FileReaderNoFile fileReaderNoFile = new FileReaderNoFile();
        String fileName = "nie_ma.txt";
        //When & Then
        assertThrows(FileReaderException.class, () -> fileReaderNoFile.readFile(fileName));
    }

    @Test
    public void testReadFileWithName () {
        //Given
        FileReaderNoFile fileReaderNoFile = new FileReaderNoFile();
        //When & Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReaderNoFile.readFile("nie_ma.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReaderNoFile.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReaderNoFile.readFile("names.txt"))
        );
    }
}
