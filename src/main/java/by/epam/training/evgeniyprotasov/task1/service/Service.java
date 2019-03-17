package by.epam.training.evgeniyprotasov.task1.service;

import by.epam.training.evgeniyprotasov.task1.entity.Gift;
import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.Sweetness;
import by.epam.training.evgeniyprotasov.task1.search.FindSweetness;
import by.epam.training.evgeniyprotasov.task1.sorts.SortBySugarPercentage;
import by.epam.training.evgeniyprotasov.task1.sorts.SortByWeight;
import org.testng.log4testng.Logger;

import java.util.List;

public class Service {
    private static final Logger log = Logger.getLogger(Service.class);
    public void sortingBySugarPercentage()
    {
        log.info("Starting soring by Sugar Percentage.");
        Gift gift= Gift.getGiftInstance();
        List<Sweetness> sweetnesses=gift.getSweetnessList();
        sweetnesses.sort(new SortBySugarPercentage());
        gift.setSweetnessList(sweetnesses);
    }

    public void sortingByWeight()
    {
        log.info("Starting soring by Weight.");
        Gift gift= Gift.getGiftInstance();
        List<Sweetness> sweetnesses=gift.getSweetnessList();
        sweetnesses.sort(new SortByWeight());
        gift.setSweetnessList(sweetnesses);
    }

    public void findingSweetnessBySugarPercentage(int range)
    {
        log.info("Starting searrh for Sweetness.");
        FindSweetness findSweetness=new FindSweetness();
        Gift gift= Gift.getGiftInstance();
        List<Sweetness> sweetnesses=gift.getSweetnessList();
        for (Sweetness sweetness:sweetnesses)
        {
            if (findSweetness.findingSweetnessBySugarPercentage(sweetness,range)==1)
                System.out.println(sweetness.toString());
        }
    }
}
