package models;
/**
 *
 * @author jahood
 */
public class Bird extends Animal {
    
    private boolean canFly;
    
    //Constructor 8 parameter- ALL
    public Bird(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
            double costIn, boolean isAvailableIn, char genderIn, boolean canFlyIn)
    {
        super(animalIdIn, nameIdIn, typeIn, ageIn, costIn, isAvailableIn, genderIn);
        canFly = canFlyIn;        
    }

}
