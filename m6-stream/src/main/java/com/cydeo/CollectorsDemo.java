package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("----------toCollection(Supplier)---------");// used to create Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);


        System.out.println("----------toList()---------");// Returns a Collector interface that gathers the input data into a new List
        List<Integer> numbersList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(numbersList2);

        System.out.println("----------toSet---------");// Returns a Collector interface that gathers the input data into a new Set
        List<Integer> numbersSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(numbersSet2);

        System.out.println("----------toMap(Function, Function)---------");// Returns Collector interface that gathers the input data into a new Map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("----------summingInt(ToIntFunction)---------");// Returns a Collector that produces the sum of an Integer-valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("----------Counting()---------");// Returns a Collector that counts the number of elements
        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("----------averagingInt(ToIntoFunction)---------");// Returns the average of the integers passed values
        Double calorieAverage =  DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("----------joining()---------");// Used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);













    }
}
