package by.epam.training.evgeniyprotasov.task1.sorts;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SortBySugarPercentageTest {


    //Given:
    private Sweetness fruit = new Fruit(100, 25, FruitFilling.A);
    private Sweetness waffle = new Waffle(15, 14, WaffleFilling.CHOCOLATE);
    private Sweetness candy = new Candy(30, 14, 30, CandyFilling.NUT);


    @DataProvider(name = "SweetnessSortBySugar")
    public Object[][] dataProvider() {
        return new Object[][]{{waffle,fruit, -1}, {waffle, candy, 0}, {fruit, candy, 1}};
    }


    //When:
    @Test(dataProvider = "SweetnessSortBySugar")
    public void testSetSortBySugarPercentage(Sweetness sweetness1, Sweetness sweetness2, int expectedresult) {
        SortBySugarPercentage sortBySugarPercentage = new SortBySugarPercentage();
        int result = sortBySugarPercentage.compare(sweetness1, sweetness2);
        //Then:
        Assert.assertEquals(expectedresult, result);
    }
}