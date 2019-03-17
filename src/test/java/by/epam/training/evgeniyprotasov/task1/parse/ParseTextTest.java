package by.epam.training.evgeniyprotasov.task1.parse;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParseTextTest {

    @Test
    public void parseText() {
        //Given:
        ParseText parseText = new ParseText();
        boolean expected = parseText.parsingText();
        //Then:
        Assert.assertTrue(expected);
    }

}