package com.sbt.javaschool.examples.lambdas.apples;

public class PrintConsumer implements AppleConsumer {

    public void accept(Apple apple) {
        System.out.println(apple);
    }
}
