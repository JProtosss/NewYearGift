package by.epam.training.evgeniyprotasov.task1.entity;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.Sweetness;

import java.util.List;

public class Gift {

    private static Gift giftInstance;

    private List<Sweetness> sweetnessList;

    private Gift() {
    }

    public static Gift getGiftInstance() {
        if (giftInstance == null) {
            giftInstance = new Gift();
        }
        return giftInstance;
    }

    public List<Sweetness> getSweetnessList() {
        return sweetnessList;
    }

    public void setSweetnessList(List<Sweetness> sweetnessList) {
        this.sweetnessList = sweetnessList;
    }
}
