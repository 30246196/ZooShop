package models;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author jahood
 */
public class ZooKeeper extends Person {
    
    private String telephoneNo;
    private boolean isRegistered;
    //Integer-> orderId
    private HashMap<Integer, Order> orders;
    
    public ZooKeeper()
    {
        super();
        telephoneNo = "";
        isRegistered = false;
        orders = new HashMap();
    }
    
    public ZooKeeper(String nameIn, String passwordIn, String emailIn, 
            Date dobIn, String telephoneNoIn, boolean isRegisteredIn)
    {
        super(nameIn, passwordIn, emailIn, dobIn);
        telephoneNo = telephoneNoIn;
        isRegistered = isRegisteredIn;
        orders = new HashMap();
    }
    
    public ZooKeeper(String nameIn, String passwordIn, String emailIn, 
            Date dobIn, String telephoneNoIn)
    {
        super(nameIn, passwordIn, emailIn, dobIn);
        telephoneNo = telephoneNoIn;
        isRegistered = false; 
        orders = new HashMap();
    }    
}
