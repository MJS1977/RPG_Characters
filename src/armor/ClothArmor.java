package armor;

public class ClothArmor implements Body,Head,Legs{

    //define variables
    private int health = 10;
    private int strength = 0;
    private int dexterity = 1;
    private int intelligence = 3;

    private int onUpHealth = 5;
    private int onUpstrength = 0;
    private int onUpdexterity = 1;
    private int onUpintelligence = 2;

    public int[] getVariables(){

        int [] variables = new int[]{health, strength, dexterity, intelligence,
                onUpHealth, onUpstrength, onUpdexterity,onUpintelligence};

        return variables;
    }

}
