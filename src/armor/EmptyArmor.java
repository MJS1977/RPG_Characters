package armor;

public class EmptyArmor implements Body,Head,Legs {

    //define variables
    private int health = 0;
    private int strength = 0;
    private int dexterity = 0;
    private int intelligence = 0;

    private int onUpHealth = 0;
    private int onUpstrength = 0;
    private int onUpdexterity = 0;
    private int onUpintelligence = 0;

    public int[] getVariables() {

        int[] variables = new int[]{health, strength, dexterity, intelligence,
                onUpHealth, onUpstrength, onUpdexterity, onUpintelligence};

        return variables;

    }
}