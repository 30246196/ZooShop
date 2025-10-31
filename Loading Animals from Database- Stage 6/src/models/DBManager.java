package models;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author jahood
 */
public class DBManager {
    
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\ZooShopDB.accdb";
    

}
