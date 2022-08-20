package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        //Creating Stream from Array

        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourse = Arrays.asList(
                new Course("Java", 100),
                new Course("Data Structures", 101),
                new Course("MS", 102)
        );

        Stream<Course> myCourseStream = myCourse.stream();

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);









    }
}
