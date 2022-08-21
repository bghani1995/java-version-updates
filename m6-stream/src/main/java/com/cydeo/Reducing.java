package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for(int number : numbers){
            sum = sum += number;
        }

        //Functional Programming
        int result = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(result);

        //Find  total calories from Dish
       int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
               .get();

        System.out.println(calTotal);

    }
}
