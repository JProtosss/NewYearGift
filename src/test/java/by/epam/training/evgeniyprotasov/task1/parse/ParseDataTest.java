package by.epam.training.evgeniyprotasov.task1.parse;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;
import by.epam.training.evgeniyprotasov.task1.entity.Gift;

import static org.testng.Assert.*;

public class ParseDataTest {

    @Test
    public void testParsingData() throws SQLException {

        ParseData parseData = new ParseData();
        parseData.parsingData();
        Gift gift = Gift.getGiftInstance();
        Assert.assertTrue(!gift.getSweetnessList().isEmpty());

    }
}