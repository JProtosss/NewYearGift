package by.epam.training.evgeniyprotasov.task1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GiftDb {

    private static Logger log = LogManager.getLogger(GiftDb.class.getName());
    private String name;
    private String url;
    private String password;
    private String driver;



    public GiftDb() {
        this.name = "root";
        this.password = "root";
        this.url = "jdbc:mysql://localhost:3306/gift";
        this.driver="com.mysql.cj.jdbc.Driver";
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(driver);
            Connection connection=DriverManager.getConnection(url+"?serverTimezone=" + TimeZone.getDefault().getID(),name,password);
            log.info("Connected to database. ("+url+")");
            return connection;
        } catch (ClassNotFoundException e) {
            log.info("Database not found.");
        }
        return null;
    }

}
