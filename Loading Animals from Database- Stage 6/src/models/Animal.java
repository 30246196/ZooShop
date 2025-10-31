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
    
    // Constructor (7- input parameters (ALL Attributes))
    public Animal(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
            double costIn, boolean isAvailableIn, char genderIn)
    {
        animalId = animalIdIn; name = nameIdIn; type = typeIn; age = ageIn; cost = costIn; 
        isAvailable = isAvailableIn; gender = genderIn;
    }
    
}
