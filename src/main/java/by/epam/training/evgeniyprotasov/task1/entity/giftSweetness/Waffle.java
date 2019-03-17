package by.epam.training.evgeniyprotasov.task1.entity.giftSweetness;

import org.testng.log4testng.Logger;

public class Waffle extends Sweetness{
    private static final Logger log = Logger.getLogger(Waffle.class);
    private WaffleFilling filling;

    public Waffle(int weight,int sugarPercentage, WaffleFilling filling)
    {
        super("Waffle",weight,sugarPercentage);
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
