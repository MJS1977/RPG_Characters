import armor.ClothArmor;
import armor.EmptyArmor;
import armor.LeatherArmor;
import armor.PlateArmor;
import hero.*;
import weapons.EmptyWeapon;
import weapons.MagicWeapon;
import weapons.MeleeWeapon;
import weapons.RangedWeapon;

public class Program {

    public static void main(String[] args) {

        //create characters and equip them
        Ranger ranger = new Ranger();
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        mage.setBodyArmor(new LeatherArmor());
        mage.setHeadArmor(new ClothArmor());
        mage.setLegsArmor(new PlateArmor());
        mage.setWeapon(new MeleeWeapon());
        for (int i = 0; i < 10; i++) {
            mage.attack();
        }
    }
}
