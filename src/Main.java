/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edith
 */

import models.DBManager;
import models.Animal;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) 
    {
        DBManager db = new DBManager();
        ArrayList<Animal> animals = db.loadAnimals();

        for (Animal a : animals)
        {
            System.out.println(a); 
            // Make sure Animal class has a toString() method
            
        }
    }
}
