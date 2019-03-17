package by.epam.training.evgeniyprotasov.task1.sorts;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.Sweetness;

import java.util.Comparator;

public class SortByWeight implements Comparator<Sweetness> {
    public int compare(Sweetness o1, Sweetness o2) {
        return ((Integer) o1.getWeight()).compareTo(o2.getWeight());
    }
}
