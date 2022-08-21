package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@gmail.com", Arrays.asList("123456789", "789456132")),
                new Employee(101, "Jon", "jon@gmail.com", Arrays.asList("12345254216", "942556132")),
                new Employee(102, "Ozzy", "ozzy@gmail.com", Arrays.asList("12345368589", "789541566132"))
        );
    }
}
