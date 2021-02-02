package hero;

import armor.Body;
import armor.Head;
import armor.Legs;
import weapons.Weapon;

public class Mage {

    //import classes
    Body body;
    Head head;
    Legs legs;
    Weapon weapon;

    //define variables
    private int health = 100;
    private int strength = 2;
    private int dexterity = 3;
    private int intelligence = 10;
    private int level = 0;
    private int xp = 0;
    private int tillNextLevel = 100;

    private int onUpHealth = 15;
    private int onUpstrength = 1;
    private int onUpdexterity = 2;
    private int onUpintelligence = 5;

    private int finalHealth = 100;
    private int finalStrength = 2;
    private int finalDexterity = 3;
    private int finalIntelligence = 10;

    //attach different bodyparts and weapons to the warrior
    public void setBodyArmor(Body body){
        this.body = body;
    }

    public void setHeadArmor(Head head){
        this.head = head;
    }

    public void setLegsArmor(Legs legs){
        this.legs = legs;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){

        //get values from the gear
        int[] bodyVar = body.getVariables();
        finalHealth = health + bodyVar[0]+(level*bodyVar[4]);
        finalStrength = strength + bodyVar[1]+(level*bodyVar[5]);
        finalDexterity = dexterity + bodyVar[2]+(level*bodyVar[6]);
        finalIntelligence = intelligence + bodyVar[3]+(level*bodyVar[7]);

        int[] headVar = head.getVariables();
        finalHealth +=  (int) Math.floor((headVar[0]+(level*headVar[4]))*0.8);
        finalStrength += (int) Math.floor((headVar[1]+(level*headVar[5]))*0.8);
        finalDexterity += (int) Math.floor((headVar[2]+(level*headVar[6]))*0.8);
        finalIntelligence += (int) Math.floor((headVar[3]+(level*headVar[7]))*0.8);

        int[] legsVar = legs.getVariables();
        finalHealth += (int) Math.floor((legsVar[0]+(level*legsVar[4]))*0.6);
        finalStrength += (int) Math.floor((legsVar[1]+(level*legsVar[5]))*0.6);
        finalDexterity += (int) Math.floor((legsVar[2]+(level*legsVar[6]))*0.6);
        finalIntelligence += (int) Math.floor((legsVar[3]+(level*legsVar[7]))*0.6);

        //get the level up values for mage
        finalHealth += onUpHealth*level;
        finalStrength += onUpstrength*level;
        finalDexterity += onUpdexterity*level;
        finalIntelligence += onUpintelligence*level;

        //check to what variable the weapon affects and calculate xp
        if(weapon.getAffectsTo() == "intelligence"){
            if (level > 0) {
                xp += (int) Math.floor(weapon.getBaseDamage()*level * weapon.getLevelScale() + (finalIntelligence * 3));
            }
            else if (level == 0){
                xp += (int) Math.floor(weapon.getBaseDamage() + (finalIntelligence * 3));
            }
        }

        if(weapon.getAffectsTo() == "dexterity"){
            if (level > 0) {
                xp += (int) Math.floor(weapon.getBaseDamage()*level * weapon.getLevelScale() + (finalDexterity * 2));
            }
            else if (level == 0){
                xp += (int) Math.floor(weapon.getBaseDamage() + (finalDexterity * 2));
            }
        }

        if(weapon.getAffectsTo() == "strength"){
            if (level > 0) {
                xp += (int) Math.floor(weapon.getBaseDamage()*level * weapon.getLevelScale() + (finalStrength * 1.5));
            }
            else if (level == 0){
                xp += (int) Math.floor(weapon.getBaseDamage() + (finalStrength * 1.5));
            }
        }

        //level up and increase the next level requirement
        if (xp >= tillNextLevel){
            level++;
            tillNextLevel += (int) Math.floor(tillNextLevel * 1.1);
        }

        //Print the results
        System.out.println("Warrior Mage stats");
        System.out.println("---------------");
        System.out.println("Hp: " + finalHealth);
        System.out.println("Str: " + finalStrength);
        System.out.println("Dex: " + finalDexterity);
        System.out.println("Int: " + finalIntelligence);
        System.out.println("Lvl: " + level);
        System.out.println("XP =  " + xp);
        System.out.println("XP to next: " + tillNextLevel);
        System.out.println("");
        System.out.println("");
        System.out.println("Weapon type");
        System.out.println("---------------");
        System.out.println(weapon.getClass().getName());
        System.out.println("");
        System.out.println("");
        System.out.println("BodyArmor type");
        System.out.println("---------------");
        System.out.println(body.getClass().getName());
        System.out.println("");
        System.out.println("");
        System.out.println("HeadArmor type");
        System.out.println("---------------");
        System.out.println(head.getClass().getName());
        System.out.println("");
        System.out.println("");
        System.out.println("LegArmor type");
        System.out.println("---------------");
        System.out.println(legs.getClass().getName());
    }
}
