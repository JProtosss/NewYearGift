package by.epam.training.evgeniyprotasov.task1.service;

import by.epam.training.evgeniyprotasov.task1.entity.Gift;
import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.Sweetness;
import by.epam.training.evgeniyprotasov.task1.search.FindSweetness;
import by.epam.training.evgeniyprotasov.task1.sorts.SortBySugarPercentage;
import by.epam.training.evgeniyprotasov.task1.sorts.SortByWeight;
import org.apache.logging.log4j.LogManager;

import java.util.List;

public class Service {
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Service.class.getName());

    public void sortingBySugarPercentage() {
        log.info("Starting sorting by Sugar Percentage.");
        Gift gift = Gift.getGiftInstance();
        List<Sweetness> sweetnesses = gift.getSweetnessList();
        sweetnesses.sort(new SortBySugarPercentage());
        gift.setSweetnessList(sweetnesses);
        log.info("Sorting ended");
    }

    public void sortingByWeight() {
        log.info("Starting sorting by Weight.");
        Gift gift = Gift.getGiftInstance();
        List<Sweetness> sweetnesses = gift.getSweetnessList();
        sweetnesses.sort(new SortByWeight());
        gift.setSweetnessList(sweetnesses);
        log.info("Sorting ended");
    }

    public void findingSweetnessBySugarPercentage(int range) {
        log.info("Starting searrh for Sweetness.");
        FindSweetness findSweetness = new FindSweetness();
        Gift gift = Gift.getGiftInstance();
        List<Sweetness> sweetnesses = gift.getSweetnessList();
        boolean flag = false;
        for (Sweetness sweetness : sweetnesses) {
            if (findSweetness.findingSweetnessBySugarPercentage(sweetness, range) == 1) {
                System.out.println(sweetness.toString());
                flag = true;
            }
        }
        if (flag) log.info("Entity was found.");
        else log.info("There is no entity for this call.");
    }
}
