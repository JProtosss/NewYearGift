package by.epam.training.evgeniyprotasov.task1.database;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.TimeZone;



public class GiftDbTest {

    @Test

    public void testGetConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/gift";

            GiftDb giftDb = new GiftDb();
            Connection connection = giftDb.getConnection();
            Assert.assertTrue(!connection.isClosed());

    }
}