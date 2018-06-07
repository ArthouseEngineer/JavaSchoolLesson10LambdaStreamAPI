package com.sbt.javaschool.examples.lambdas.apples;

public class GreenApplesPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
