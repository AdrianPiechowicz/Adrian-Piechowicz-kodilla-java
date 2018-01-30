package com.kodilla.exception.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileReader {

    public void readFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());


        try (Stream<String> fileLines = Files.lines(Paths.get("sad.txt"))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e){
            System.out.println("OOOOps! Something went wrong! Error "+e);
        } finally {
            System.out.println("Finally....");
        }
    }
}
