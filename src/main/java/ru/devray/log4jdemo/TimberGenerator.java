package ru.devray.log4jdemo;

import java.util.ArrayList;
import java.util.List;

import static ru.devray.log4jdemo.Main.logger;

public class TimberGenerator {
    public static List<Timber> generatePackOfTimber(int countTimber){
        List<Timber> packOfTimber = new ArrayList<>();
        for(int i = 0; i<countTimber; i++){
            packOfTimber.add(generateTimber());
            logger.debug("Added timber to pack.");
        }
        return packOfTimber;
    }

    public static Timber generateTimber(){
        int timberNumber = (int) (Math.random() * 100000);
        int timberWeight = (int) (Math.random() * 60);
        logger.debug("Будет сформирована пачка древесины весом " + timberWeight);
        return new Timber(timberNumber, timberWeight);
    }
}
