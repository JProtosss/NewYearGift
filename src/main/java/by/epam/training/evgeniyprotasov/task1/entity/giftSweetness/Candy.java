package by.epam.training.evgeniyprotasov.task1.entity.giftSweetness;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Candy extends Sweetness{
    private static Logger log = LogManager.getLogger(Candy.class.getName());

    private CandyFilling filling;
    private int cocoaPercentage;

    public Candy(int weight,int sugarPercentage, int cocoaPercentage,CandyFilling filling)
    {
        super("Candy",weight,sugarPercentage);
        log.info("Trying to create Candy...");
        this.cocoaPercentage=cocoaPercentage;
        this.filling=filling;
        log.info("Candy was added.");
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setFilling(CandyFilling filling) {
        this.filling = filling;
    }

    public CandyFilling getFilling() {
        return filling;
    }
}
