package ru.devray.log4jdemo;

import java.util.ArrayList;
import java.util.List;

public class TimberGenerator {
    public static List<Timber> generatePackOfTimber(int countTimber){
        List<Timber> packOfTimber = new ArrayList<>();
        for(int i = 0; i<countTimber; i++){
            packOfTimber.add(generateTimber());
        }
        return packOfTimber;
    }

    public static Timber generateTimber(){
        int timberNumber = (int) (Math.random() * 100000);
        int timberWeight = (int) (Math.random() * 60);
        System.out.println("Будет сформирована пачка древесины весом " + timberWeight);
        return new Timber(timberNumber, timberWeight);
    }
}
