package models;


import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;


/**
 *
 * @author jahood
 */
public class DBManager {
    
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\ZooShopDB.accdb";
    // START CODING
    
    
    public ArrayList<Animal> loadAnimals() // fix imports
    {
        // create an ArrayList to store the content of the Animals table ans see it
        ArrayList<Animal> allAnimals = new ArrayList();
        
        try
        {
            // Connects to the Access Database
            
            // loads the UCAnAccess JDBC driver from the String variable defined before
            Class.forName(driver); 
            // connects to ZooShopDB.accdb using the path specified in the 
            // definition of the variable connectionString 
            Connection conn = DriverManager.getConnection(connectionString);
            // Executes a SQL Query
            // Runs a query to pick all rows from the Animals table
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Animals");
            
            // Process each row
            while(rs.next())
            {
                // Extract column values 
                int animalId = rs.getInt("AnimalID");
                String name = rs.getString("AnimalName");
                char gender = rs.getString("Gender").charAt(0);
                String type = rs.getString("Type");
                int age = rs.getInt("Age");
                String waterType = rs.getString("WaterType");
                boolean canFly = rs.getBoolean("CanFly");
                boolean availability= rs.getBoolean("Availability");
                double cost = rs.getDouble("Cost");
                String category = rs.getString("AnimalCategory");
                
                // create a Bird or a Fish object based on category
                // String1.equals(String2)
                //suitable constructor for 
                if(category.equals("Bird"))
                {
                    // from the constructor
                    //Bird(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
                    //double costIn, boolean isAvailableIn, char genderIn, boolean canFlyIn)
                    Bird b = new Bird(animalId,name,type,age,cost,availability,gender,canFly);
                    // adds to AllAnimals list
                    allAnimals.add(b);
                }
                else if(category.equals("Fish"))
                {
                    // from the constructor as a guide
                    // animalIdIn, String nameIdIn, String typeIn, int ageIn,
                    //double costIn, boolean isAvailableIn, char genderIn,
                    //String waterTypeIn
                    Fish f = new Fish(animalId,name,type,age,cost, availability, gender,waterType);
                    // adds to AllAnimals list
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
