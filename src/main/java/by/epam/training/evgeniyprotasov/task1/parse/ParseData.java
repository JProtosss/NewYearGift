package by.epam.training.evgeniyprotasov.task1.parse;

import by.epam.training.evgeniyprotasov.task1.entity.Gift;
import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import by.epam.training.evgeniyprotasov.task1.database.GiftDb;


public class ParseData {
    private static Logger log = LogManager.getLogger(ParseData.class.getName());

    public void parsingData() throws SQLException {


        log.info("Start creating gift.");
        GiftDb db = new GiftDb();
        Connection conn = db.getConnection();
        Statement statement = conn.createStatement();

        ResultSet table = statement.executeQuery("select * from candy");



        List<Sweetness> sweetness = new ArrayList<>();
        while (table.next()) {
            sweetness.add(new Candy(table.getInt("weight"), table.getInt("sugarPercentage"), table.getInt("cocoaPercentage"), parsingCandyFilling(table.getString("filling"))));
        }

       table = statement.executeQuery("select * from fruit");
        while (table.next()) {
            sweetness.add(new Fruit(table.getInt("weight"), table.getInt("sugarPercentage"), parsingFruitFilling(table.getString("vitamin"))));
        }
        table = statement.executeQuery("select * from waffle");
        while (table.next()) {
            sweetness.add(new Waffle(table.getInt("weight"), table.getInt("sugarPercentage"), parsingWaffleFilling(table.getString("filling"))));
        }

        Gift gift = Gift.getGiftInstance();
        gift.setSweetnessList(sweetness);
        log.info("Gift was created.");

        table.close();
        statement.close();
    }

    private CandyFilling parsingCandyFilling(String filling) {
        switch (filling.toLowerCase()) {
            case "Nut":
                return CandyFilling.NUT;

            case "Marmalade":
                return CandyFilling.MARMALADE;

            default:
                return CandyFilling.EMPTY;

        }
    }

    private WaffleFilling parsingWaffleFilling(String filling) {
        switch (filling.toLowerCase()) {
            case "Chocolate":
                return WaffleFilling.CHOCOLATE;
            case "Vanilla":
                return WaffleFilling.VANILLA;
            default:
                return null;
        }
    }

    private FruitFilling parsingFruitFilling(String filling) {
        switch (filling.toLowerCase()) {
            case "A":
                return FruitFilling.A;
            case "B":
                return FruitFilling.B;
            case "C":
                return FruitFilling.C;
            default:
                return null;
        }
    }
}
