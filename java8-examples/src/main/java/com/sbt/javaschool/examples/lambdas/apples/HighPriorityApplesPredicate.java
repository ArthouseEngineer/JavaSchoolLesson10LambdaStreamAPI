package com.sbt.javaschool.examples.lambdas.apples;

public class HighPriorityApplesPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
