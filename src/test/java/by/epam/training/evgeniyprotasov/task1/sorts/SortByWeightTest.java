package by.epam.training.evgeniyprotasov.task1.sorts;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortByWeightTest {

    //Given:
    private Sweetness sweetness1 = new Fruit(100, 4, FruitFilling.A);
    private Sweetness sweetness2 = new Waffle(10, 14, WaffleFilling.CHOCOLATE);

    //When:
    short expectedresult = 1;

//Then:

    @Test
    public void setSortBySugarPercentage() {
        SortByWeight sortByWeight = new SortByWeight();
        int result=sortByWeight.compare(sweetness1,sweetness2);
        Assert.assertEquals(expectedresult,result);
    }
}