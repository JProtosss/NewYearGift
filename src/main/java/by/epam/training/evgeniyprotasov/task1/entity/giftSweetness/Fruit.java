package by.epam.training.evgeniyprotasov.task1.entity.giftSweetness;

import org.testng.log4testng.Logger;

public class Fruit extends Sweetness {
    private static final Logger log = Logger.getLogger(Fruit.class);
    private FruitFilling vitamin;

    public Fruit(int weight,int sugarPercentage,FruitFilling vitamin)
    {
        super("Fruit",weight,sugarPercentage);
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

