package by.epam.training.evgeniyprotasov.task1.search;

import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindSweetnessTest {

    Candy candy = new Candy(100, 10, 10, CandyFilling.NUT);
    Waffle waffle = new Waffle(10, 14, WaffleFilling.CHOCOLATE);
    Fruit fruit = new Fruit(100, 4, FruitFilling.A);

    @DataProvider(name = "SweetnessFindingDataProvider")
    public Object[][] dataProvider() {
        return new Object[][]{{candy, 10, 1}, {waffle, 5 , -1}, {fruit, 4, 1}};
    }

    //Given:
    FindSweetness findSweetness = new FindSweetness();


    @Test(dataProvider = "SweetnessFindingDataProvider")
    public void findSweetnessMethod(Sweetness sweet, int sugarPercentage, int expectedResult) {
        //When:
        int result = findSweetness.findingSweetnessBySugarPercentage(sweet, sugarPercentage);

        //Then:
        Assert.assertEquals(result, expectedResult);

    }

}