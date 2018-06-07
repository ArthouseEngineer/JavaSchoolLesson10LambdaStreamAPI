package com.sbt.javaschool.examples.lambdas.dishes;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<Dish> menu = Arrays.asList(
                new Dish(700, "FISH","prawns", false),
                new Dish(400, "FISH","salmon", false),
                new Dish(350, "OTHER","french fries", true),
                new Dish(220, "OTHER","rice", true),
                new Dish(200, "OTHER","season fruit", true),
                new Dish(850, "OTHER","pizza", false),
                new Dish(900, "MEAT","pork", false),
                new Dish(1100, "MEAT","beef", false),
                new Dish(600, "MEAT","chicken", false)
        );
    }

}
