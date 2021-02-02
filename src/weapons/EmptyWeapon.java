package weapons;

import armor.Body;
import armor.Head;
import armor.Legs;

public class EmptyWeapon implements Weapon {

    //define variables
    private int baseDamage = 0;
    private int levelScale = 0;
    private String affectsTo= "";
    private double multiplier = 0;

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
