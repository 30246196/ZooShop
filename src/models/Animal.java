package models;
/**
 *
 * @author jahood
 */
public class Animal {
    
    private int animalId; 
    private String name;
    private String type;
    private int age;
    private double cost;
    private boolean isAvailable;
    private char gender;
    
    public int getAnimalId()
    {
        return animalId;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public Animal()
    {
        animalId = 0;
        name = "";
        type = "";
        age = 0;
        cost = 0;
        isAvailable = false;
        gender = '?';
    }

    @Override
    public String toString()
    {
        String animalOutput = name + " the " + type;
        return animalOutput;
    }
    
    // Constructor (7- input parameters (ALL Attributes))
    public Animal(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
            double costIn, boolean isAvailableIn, char genderIn)
    {
        animalId = animalIdIn; name = nameIdIn; type = typeIn; age = ageIn; cost = costIn; 
        isAvailable = isAvailableIn; gender = genderIn;
    }
    
}
