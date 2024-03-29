package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(){

        final ClassLoader classLoader = getClass().getClassLoader();
        final File file = new File(classLoader.getResource("file/names.txt").getFile());

        try (final Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){

            fileLines.forEach(System.out::println);

        } catch (IOException e) {

            System.out.println("Something went wrong: " + e);

        } finally {

            System.out.println("I'm gonna be here always");

        }
    }
}
