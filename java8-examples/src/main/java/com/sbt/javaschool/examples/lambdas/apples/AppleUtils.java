package com.sbt.javaschool.examples.lambdas.apples;

import java.util.ArrayList;
import java.util.List;

public class AppleUtils {

    public static List<Apple> filterApples(List<Apple> inputApples, ApplePredicate predicate) {
        List<Apple> apples = new ArrayList<Apple>();

        for (Apple apple : inputApples) {
            if (predicate.test(apple)) {
                apples.add(apple);
            }
        }

        return apples;
    }

    public static void doWithApples(List<Apple> inputApples, AppleConsumer consumer) {
        for (Apple apple : inputApples) {
                consumer.accept(apple);
            }

    }

}
