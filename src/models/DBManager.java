package models;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

/**
 *
 * @author jahood
 */
public class DBManager {
    
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\ZooShopDB.accdb";
 
    // writeOrder() method added in stage 8
    public void writeOrder(Order o, String zkEmail)
    {
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            //execute a query
            stmt.executeUpdate("INSERT INTO Orders(OrderDate,ZooKeeper,OrderTotal,Status) " 
            + " VALUES("
            + "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(o.getOrderDate()) + "',"
                    + "'" + zkEmail + "'," 
                    + "'" + o.getOrderTotal() + "'," 
                         + "'" +  o.getStatus() +  "'" 
            + ")"); 
// several lines """
            // TODO create getters in Order class DONE
            ////VALUES ('"7/11/2025","test1@test1.com")
            
        }
        catch(Exception ex)
        {
            System.out.println("Error writing Order:" + ex.getMessage());
        }
    }
    
    public ArrayList<Animal> loadAnimals()
    {
        ArrayList<Animal> allAnimals = new ArrayList();
        
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Animals");
            
            while(rs.next())
            {
                int animalId = rs.getInt("AnimalID");
                String name = rs.getString("AnimalName");
                char gender = rs.getString("Gender").charAt(0);
                String type = rs.getString("Type");
                int age = rs.getInt("Age");
                String waterType = rs.getString("WaterType");
                boolean canFly = rs.getBoolean("CanFly");
                boolean availability = rs.getBoolean("Availability");
                double cost = rs.getDouble("Cost");
                String category = rs.getString("AnimalCategory");
                
                //String1.equals(String2) compare 2 strings
                if(category.equals("Bird"))
                {
                    //Bird(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
                    //double costIn, boolean isAvailableIn, char genderIn, boolean canFlyIn)
                    Bird b = new Bird(animalId, name, type, age, cost, availability, gender, canFly);
                    allAnimals.add(b);
                }
                else if(category.equals("Fish"))
                {
                    //Fish(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
                    //double costIn, boolean isAvailableIn, char genderIn, String waterTypeIn)
                    Fish f = new Fish(animalId, name, type, age, cost, availability, gender, waterType);
                    allAnimals.add(f);
                }
    
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error loading animals: " + ex.getMessage());
        }
        finally
        {
            return allAnimals;
        }
    }
    
    

}
