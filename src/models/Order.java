package models;// added in stage 7


import java.util.Date;
import java.util.HashMap;

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
    //HashMap<Date_Type_of_Key, Date_Type_of_Value>
    //Integer- orderLineId
    private HashMap<Integer, OrderLine> orderLines;
    
    
    //added at 7 stage
    public void addOrderLine(OrderLine ol)
    {
        int orderLineId = 0;
        
       while(orderLines.containsKey(orderLineId))
                {
                    orderLineId++;
                }
       
       ol.setOrderLineId(orderLineId);
       // create set OrderLineId() in OrderLIne TODO
       orderLines.put(orderLineId, ol);/// tptdp
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
