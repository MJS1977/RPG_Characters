package weapons;

public class RangedWeapon implements Weapon {

    //define variables
    private int baseDamage = 5;
    private int levelScale = 3;
    private String affectsTo= "dexterity";
    double multiplier = 2;


    public int getBaseDamage(){
        return baseDamage;
    }

    public int getLevelScale(){
        return levelScale;
    }

    public String getAffectsTo(){
        return affectsTo;
    }

    public Double getMultiplier(){
        return multiplier;
    }
}
