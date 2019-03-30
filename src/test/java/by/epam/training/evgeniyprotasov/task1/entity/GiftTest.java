package by.epam.training.evgeniyprotasov.task1.entity;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class GiftTest {


    Candy candy = new Candy(100, 10, 10, CandyFilling.NUT);
    Waffle waffle = new Waffle(10, 14, WaffleFilling.CHOCOLATE);
    Fruit fruit = new Fruit(100, 4, FruitFilling.A);

    @Test
    public void testGetWeight() {
        List<Sweetness> sweetnessList = new ArrayList<>();
        sweetnessList.add(candy);
        sweetnessList.add(waffle);
        sweetnessList.add(fruit);

        Gift gift = Gift.getGiftInstance();
        gift.setSweetnessList(sweetnessList);

        Assert.assertEquals(candy.getWeight() + waffle.getWeight() + fruit.getWeight(), gift.getWeight());

    }
}