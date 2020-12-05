package com.kodilla.exception.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderNoFile {
    public void readFile(final String fileName) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }

}
