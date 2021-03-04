package ru.devray.log4jdemo;

public class WoodProcessor {

    public WoodProcessor() {
        System.out.println("Created wood processor building;");
    }

    public PolishedWood process(Timber timber){
        if (timber == null){
            System.out.println("Timber is empty!");
        } else {
            System.out.println("Timber is present.");
        }

        int timberNumber = timber.number;
        int timberWeight = timber.weight;
        // [weight] = 23, [timber number] = 100023
        //System.out.println("[weight] = " + timberWeight + ", [timber number] = " + timberNumber);
        System.out.println(String.format("[weight] = %d, [timber.number] = %d", timberWeight, timberNumber));

        int polishedWoodNumber = (int) (Math.random() * 100000);
        int polishedWoodWeight = (int) (Math.random() * timberWeight);
        System.out.println(
                String.format("[polished wood weight] = %d, [polished wood number] = %d", polishedWoodWeight, polishedWoodNumber));

        PolishedWood wood = new PolishedWood(polishedWoodNumber, polishedWoodWeight);
        if (wood == null){
            System.out.println("No wood!");
        } else {
            System.out.println("Wood is polished.");
        }
        return null;
    }
}
