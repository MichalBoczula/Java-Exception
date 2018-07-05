package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args){


    }

    public static void mod82(){
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }

    public static void mod83(){

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();

        try {

            fileReaderWithoutHandling.readFile();

        } catch (FileReaderException e) {

            System.out.println("Problem with reading a file!");
        }
    }
}
