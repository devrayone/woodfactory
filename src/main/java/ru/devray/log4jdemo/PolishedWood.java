package ru.devray.log4jdemo;

import static ru.devray.log4jdemo.Main.logger;

public class PolishedWood {
    int id;
    int weight;

    public PolishedWood(int id, int weight) {
        this.id = id;
        this.weight = weight;
        logger.trace("Polished timber to polished wood state");
    }
}
