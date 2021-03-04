package ru.devray.log4jdemo;

import static ru.devray.log4jdemo.Main.logger;

public class Timber {
    int number;
    int weight;

    public Timber(int number, int weight) {
        this.number = number;
        this.weight = weight;
        logger.trace("Constructed timber.");
    }
}
