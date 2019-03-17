package by.epam.training.evgeniyprotasov.task1.parse;

import by.epam.training.evgeniyprotasov.task1.entity.Gift;
import by.epam.training.evgeniyprotasov.task1.entity.giftSweetness.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ParseText {
    private static Logger log = LogManager.getLogger(ParseText.class.getName());
    public boolean parsingText(){
        List<String> lines = new ArrayList<>();

        try {
            log.info("Connecting to file for reading...");
            BufferedReader in = new BufferedReader(new FileReader("GiftContents.txt"));
            String line;
            while ((line= in.readLine())!=null)
            {
                lines.add(line);
            }
            log.info("Connection successful.");
        }catch (IOException e) {e.printStackTrace(); log.error("Connection failed!");}

        List<Sweetness> sweetness = new ArrayList<>();

        for (String line : lines) {
            String[] content = line.split(" ");
            sweetness.add(parsingSweetness(content));
        }


        Gift gift=Gift.getGiftInstance();
        gift.setSweetnessList(sweetness);
        log.info("File was parsed.");
        return true;
    }

    private Sweetness parsingSweetness(String[] content) {
        switch (content[0]) {
            case "Candy":
                log.info("Trying to create Candy...");
                return new Candy(Integer.parseInt(content[1]), Integer.parseInt(content[2]), Integer.parseInt(content[3]), parsingCandyFilling(content[4]));

            case "Waffle":
                log.info("Trying to create Waffle...");
                return new Waffle(Integer.parseInt(content[1]), Integer.parseInt(content[2]), parsingWaffleFilling(content[3]));

            case "Fruit":
                log.info("Trying to create Fruit...");
                return new Fruit(Integer.parseInt(content[1]), Integer.parseInt(content[2]), parsingFruitFilling(content[3]));

            default:
                return null;
        }

    }

    private CandyFilling parsingCandyFilling(String filling) {
        switch (filling) {
            case "Nut":
                return CandyFilling.NUT;

            case "Marmalade":
                return CandyFilling.MARMALADE;

            default:
                return CandyFilling.EMPTY;

        }
    }

    private WaffleFilling parsingWaffleFilling(String filling) {
        switch (filling) {
            case "Chocolate":
                return WaffleFilling.CHOCOLATE;
            case "Vanilla":
                return WaffleFilling.VANILLA;
            default:
                return null;
        }
    }

    private FruitFilling parsingFruitFilling(String filling) {
        switch (filling) {
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
