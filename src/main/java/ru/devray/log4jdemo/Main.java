package ru.devray.log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static ru.devray.log4jdemo.TimberGenerator.generatePackOfTimber;

public class Main {

    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Started processing.");
        List<Timber> packOfTimber = generatePackOfTimber(30);
        List<PolishedWood> processedWood = new ArrayList<>();

        WoodProcessor factory = new WoodProcessor();


        for (Timber t : packOfTimber) {
            processedWood.add(factory.process(t));
            //System.out.println("Wood processed and stored to wood storage");
            logger.info("Wood processed and stored to wood storage");
        }
        logger.info("Finished processing.");

    }
}
