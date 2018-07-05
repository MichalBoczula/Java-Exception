package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {

    public void readFile() throws FileReaderException {

        final ClassLoader classLoader = getClass().getClassLoader();
        final File file = new File(classLoader.getResource("file/name.txt").getFile());

        try {

            final Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));

        } catch (IOException e) {

            throw new FileReaderException();

        } finally {

            System.out.println("Always here");

        }
    }
}
