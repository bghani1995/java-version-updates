package com.cydeo.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("----------Print all emails-------------");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("----------Print all phone numbers-------------");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        System.out.println("----------Print all phone numbers w/ double colon-------------");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
