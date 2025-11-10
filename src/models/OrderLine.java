package models;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jahood
 */
public class OrderLine {
    
    private int orderLineId;
    private Animal animalBought; // Association
    private double lineTotal;
    
    //Getters and Setters
    public void setOrderLineId(int orderLineIdIn)
    {
        orderLineId = orderLineIdIn;
    }
    
    
    public int getOrderLineId()
    {
        return orderLineId;
    }            
    
    //Getter
    public Animal getAnimalBought()
    {
        return animalBought;
    }
    
    //TODO added stage 8 getLineTotal()
    // DONE
    // Getter
    public double getLineTotal()
    {
        return lineTotal;
    }
    
    
    
    //Setter
    public void setAnimalBought(Animal animalBoughtIn)
    {
        animalBought = animalBoughtIn;
    }
    

    
    //Constructors- 0 input parameter
    public OrderLine()
    {
        orderLineId = 0;
        animalBought = new Animal();
        lineTotal = 0;
    }
    
    //Constructors- 3 input parameter
    public OrderLine(int orderLineIdIn, Animal animalIn, double lineTotalIn)
    {
        orderLineId = orderLineIdIn;
        animalBought = animalIn;
        lineTotal = lineTotalIn;
    }
    
    //Constructors- 2 input parameter (ALL except lineTotal- which is calculated)
    public OrderLine(int orderLineIdIn, Animal animalIn)
    {
        orderLineId = orderLineIdIn;
        animalBought = animalIn;
        lineTotal = animalBought.getCost();
    }
    
    //Constructor- just Animal
    public OrderLine(Animal animalIn)
    {
        orderLineId = 0;
        animalBought = animalIn;
        lineTotal = animalBought.getCost();
    }
    
    
}
