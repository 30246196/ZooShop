package models;
/**
 *
 * @author jahood
 */
public class Fish extends Animal{
    
    private String waterType;
    
    //Constructor 8 parameter- ALL
    public Fish(int animalIdIn, String nameIdIn, String typeIn, int ageIn,
            double costIn, boolean isAvailableIn, char genderIn, String waterTypeIn)
    {
        super(animalIdIn, nameIdIn, typeIn, ageIn, costIn, isAvailableIn, genderIn);
        waterType = waterTypeIn;
    }
    
}
