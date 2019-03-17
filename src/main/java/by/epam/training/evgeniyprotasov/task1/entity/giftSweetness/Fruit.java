package by.epam.training.evgeniyprotasov.task1.entity.giftSweetness;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fruit extends Sweetness {
    private static Logger log = LogManager.getLogger(Fruit.class.getName());
    private FruitFilling vitamin;

    public Fruit(int weight,int sugarPercentage,FruitFilling vitamin)
    {
        super("Fruit",weight,sugarPercentage);
        log.info("Trying to create Fruit...");
        this.vitamin=vitamin;
        log.info("Fruit was added.");
    }

    public void setVitamin(FruitFilling vitamin) {
        this.vitamin = vitamin;
    }

    public FruitFilling getVitamin() {
        return vitamin;
    }
}

