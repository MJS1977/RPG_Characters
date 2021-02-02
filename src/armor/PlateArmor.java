package armor;

public class PlateArmor implements Body,Head,Legs{

    //define variables
    private int health = 30;
    private int strength = 3;
    private int dexterity = 1;
    private int intelligence = 0;

    private int onUpHealth = 12;
    private int onUpstrength = 2;
    private int onUpdexterity = 1;
    private int onUpintelligence = 0;

    public int[] getVariables() {

        int[] variables = new int[]{health, strength, dexterity, intelligence,
                onUpHealth, onUpstrength, onUpdexterity, onUpintelligence};

        return variables;

    }
}
