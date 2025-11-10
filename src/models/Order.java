package models;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jahood
 */
public class Order {
    
    //Attributes
    private int orderId;
    private Date orderDate;
    private String status;
    private double orderTotal;
    
    private HashMap<Integer, OrderLine> orderLines;
    // added stage 8 calculate orderTotal
    // create a method to calculate the totsl
    public void calculateOrderTotal()
    {
        //reset
        orderTotal = 0;
        for(Map.Entry<Integer,OrderLine> olMapEntry : orderLines.entrySet())//fix imports
        {
            // retrieves the value from
            OrderLine actualOrderLine = olMapEntry.getValue();
            // TODO create a getLineTotal() method inside orderLine 
            // DONE
            orderTotal = orderTotal + actualOrderLine.getLineTotal();
                        
        }
    }
    
    
    public void addOrderLine(OrderLine ol)
    {
        int orderLineId = 0;
        
        while(orderLines.containsKey(orderLineId))
        {
            orderLineId++;
        }
        
        ol.setOrderLineId(orderLineId); 
                //create setOrderLineId in OrderLine
        orderLines.put(orderLineId, ol);
        
        calculateOrderTotal();//
    }
   
    //Getters and Setters
    
    //Getter for orderLines
    public HashMap<Integer, OrderLine> getOrderLines()
    {
        return orderLines;
    }
    
    //Setter for orderLines
    public void setOrderLines(HashMap<Integer, OrderLine> orderLinesIn)
    {
        orderLines = orderLinesIn;
    }
    
    // added in stage 8
    // getter 
    public Date getOrderDate()
    {
        return orderDate;
    }   
    //getter
    public double getOrderTotal()
    {
        return orderTotal;
    }        
    //getter
    public String getStatus()
    {
        return status;
    }
    // end added stage 8
    
    //Constructors - 0 input parameter
    public Order()
    {
        orderId = 0;
        orderDate = new Date();
        status = "Ongoing";
        orderTotal = 0;
        orderLines = new HashMap();
    }
    
    //Constructors - 4 input parameter
    public Order(int orderIdIn, Date orderDateIn, 
            String statusIn, double orderTotalIn)
    {
        orderId = orderIdIn;
        orderDate = orderDateIn;
        status = statusIn;
        orderTotal = orderTotalIn;
        orderLines = new HashMap();
    }
            
}
