package by.epam.training.evgeniyprotasov.task1.entity.giftSweetness;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Waffle extends Sweetness{
    private static Logger log = LogManager.getLogger(Waffle.class.getName());
    private WaffleFilling filling;

    public Waffle(int weight,int sugarPercentage, WaffleFilling filling)
    {
        super("Waffle",weight,sugarPercentage);
        log.info("Trying to create Waffle...");
        this.filling=filling;
        log.info("Waffle was added.");
    }

    public void setFilling(WaffleFilling filling) {
        this.filling = filling;
    }

    public WaffleFilling getFilling() {
        return filling;
    }
}
