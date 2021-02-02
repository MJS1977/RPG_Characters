package weapons;

public class MagicWeapon implements Weapon {

    //define variables
    private int baseDamage = 25;
    private int levelScale = 2;
    private String affectsTo= "intelligence";
    double multiplier = 3;


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
