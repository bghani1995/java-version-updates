package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
                //.reduce((a,b) -> a+b)
               .reduce(Integer::sum)
               .get();
        System.out.println(calTotal);

        System.out.println("----------MIN & MAX---------");
       Optional<Integer> min = numbers.stream(). reduce(Integer::min);
       Optional<Integer> max = numbers.stream(). reduce(Integer::max);
       Optional<Integer> sum2 = numbers.stream(). reduce(Integer::sum);

        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
        System.out.println("Sum: " + sum2.get());

        System.out.println("----------COUNT---------");//Counts number of objects in stream
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
