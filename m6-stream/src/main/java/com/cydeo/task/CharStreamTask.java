package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        //Task - Print number character of each word in List
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);
    }
}
