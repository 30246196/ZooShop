package models;
import java.util.Date;

/**
 *
 * @author jahood
 */
public class Person {
    
    private String name;
    private String email;
    private String password;
    private Date dob;
    
    public Person()
    {
        name = "";
        password = "";
        email = "";
        dob = new Date();
    }
    
    public Person(String nameIn, String passwordIn, 
            String emailIn, Date dobIn)
    {
        name = nameIn;
        password = passwordIn;
        email = emailIn;
        dob = dobIn;               
    }
    
    // aded in stage 8
    // Setter
    public void setEmail(String emailIn)
    {
        email = emailIn;
    }
    // getter
    public String getEmail()
    {
        return email;
    }
}
