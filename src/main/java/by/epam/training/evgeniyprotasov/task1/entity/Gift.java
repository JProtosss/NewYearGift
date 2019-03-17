package by.epam.training.evgeniyprotasov.task1.entity;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.Sweetness;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Gift {

    private static Logger log = LogManager.getLogger(Gift.class.getName());
    private static Gift giftInstance;

    private List<Sweetness> sweetnessList;

    private Gift() {
    }

    public static Gift getGiftInstance() {
        if (giftInstance == null) {
            log.info("First Initialization of Gift.");
            giftInstance = new Gift();
            log.info("Initialization completed.");
        }
        return giftInstance;
    }

    public List<Sweetness> getSweetnessList() {
        return sweetnessList;
    }

    public void setSweetnessList(List<Sweetness> sweetnessList) {

        log.info("Setting new List of Sweetness's to Gift.");
        this.sweetnessList = sweetnessList;
    }
}
