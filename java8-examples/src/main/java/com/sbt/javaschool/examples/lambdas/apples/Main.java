package com.sbt.javaschool.examples.lambdas.apples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Apple> inventory = Arrays.asList(
                new Apple(120, "green"),
                new Apple(190, "red"),
                new Apple(190, "green"),
                new Apple(120, "red"),
                new Apple(170, "green"),
                new Apple(170, "red")
                );

        System.out.println("Big Apples");
        System.out.println(AppleUtils.filterApples(inventory, new HighPriorityApplesPredicate()));

        System.out.println("Only green apples");
        System.out.println(AppleUtils.filterApples(inventory, new GreenApplesPredicate()));

        System.out.println("Printing");
        AppleUtils.doWithApples(inventory, System.out::println);





    }




}
