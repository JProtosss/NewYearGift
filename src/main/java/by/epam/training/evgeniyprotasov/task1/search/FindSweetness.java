package by.epam.training.evgeniyprotasov.task1.search;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.Sweetness;

public class FindSweetness {
    public int findingSweetnessBySugarPercentage(Sweetness sweetness, int range) {

        if (sweetness.getSugarPercentage() <= range)
            return 1;
        else return -1;
    }
}
