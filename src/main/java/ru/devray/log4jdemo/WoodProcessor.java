package ru.devray.log4jdemo;

import static ru.devray.log4jdemo.Main.logger;

public class WoodProcessor {

    public WoodProcessor() {
        logger.trace("Created wood processor building;");
    }

    public PolishedWood process(Timber timber){
        if (timber == null){
            logger.error("Timber is empty!");
        } else {
            logger.debug("Timber is present.");
        }

        int timberNumber = timber.number;
        int timberWeight = timber.weight;
        // [weight] = 23, [timber number] = 100023
        //System.out.println("[weight] = " + timberWeight + ", [timber number] = " + timberNumber);
        logger.debug(String.format("[weight] = %d, [timber.number] = %d", timberWeight, timberNumber));

        int polishedWoodNumber = (int) (Math.random() * 100000);
        int polishedWoodWeight = (int) (Math.random() * timberWeight);
        logger.debug(
                String.format("[polished wood weight] = %d, [polished wood number] = %d", polishedWoodWeight, polishedWoodNumber));

        PolishedWood wood = new PolishedWood(polishedWoodNumber, polishedWoodWeight);
        if (wood == null){
            logger.error("No wood!");
        } else {
            logger.info("Wood is polished.");
        }
        return wood;
    }
}
