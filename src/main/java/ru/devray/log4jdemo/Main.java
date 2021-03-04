package ru.devray.log4jdemo;

import java.util.ArrayList;
import java.util.List;

import static ru.devray.log4jdemo.TimberGenerator.generatePackOfTimber;

public class Main {
    public static void main(String[] args) {
        List<Timber> packOfTimber = generatePackOfTimber(30);
        List<PolishedWood> processedWood = new ArrayList<>();

        WoodProcessor factory = new WoodProcessor();


        for (Timber t : packOfTimber) {
            processedWood.add(factory.process(t));
            System.out.println("Wood processed and stored to wood storage");
        }


    }
}
