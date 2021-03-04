package ru.devray.log4jdemo;

public class Timber {
    int number;
    int weight;

    public Timber(int number, int weight) {
        this.number = number;
        this.weight = weight;
        System.out.println("Constructed timber.");
    }
}
