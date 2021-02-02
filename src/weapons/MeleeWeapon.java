package weapons;

public class MeleeWeapon implements Weapon {

    //define variables
    private int baseDamage = 15;
    private int levelScale = 2;
    private String affectsTo= "strength";
    double multiplier = 1.5;


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
