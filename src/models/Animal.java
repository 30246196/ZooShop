package models; // added is stage 7
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
    private boolean isAvailable;// create a getter for isAvailable
    private char gender;
    
    // getter IsAvailable
    public boolean getIsAvailable()
    {
                return isAvailable;
            }
    
    public Animal()// added in stage 7
    {
        animalId=0;
        name="";
        type="";
        age=0;
        cost=0;
        isAvailable=false;
        gender='?';// single 
    }
    //GETTERS
    
    public int getAnimalId()
    {
        return animalId;
    }
    
    public String getType()
    {
        return type;
    }
            
    public String getName()
    {
        return name;
    }
    
    // added in stage 7
    public double getCost()
    {
        return cost;
    }
    
    
    
    // redefine the method toString() to show parts of animal on the list
    @Override // from clicking on the warning on line 18 and select
    public String toString() // stage 6
    {
        String animalOutput = name +" the " + type;
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
