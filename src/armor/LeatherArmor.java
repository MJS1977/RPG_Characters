package armor;

public class LeatherArmor implements Body,Head,Legs{

    //define variables
    private int health = 20;
    private int strength = 1;
    private int dexterity = 3;
    private int intelligence = 0;

    private int onUpHealth = 8;
    private int onUpstrength = 1;
    private int onUpdexterity = 2;
    private int onUpintelligence = 0;

    public int[] getVariables() {

        int[] variables = new int[]{health, strength, dexterity, intelligence,
                onUpHealth, onUpstrength, onUpdexterity, onUpintelligence};

        return variables;

    }
}
