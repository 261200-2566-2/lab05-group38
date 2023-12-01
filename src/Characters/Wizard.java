package Characters;

import Characters.Interface.Mage;
import Equipments.Equipment;

import java.util.HashMap;

public class Wizard extends  Character implements Mage {
    public Wizard(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }
    public void castSpell(String skillName) {
        if(skillName == "meteorShower") meteorShower();
        if(skillName == "comet") comet();
        if(skillName == "manaShield") manaShield();
    };

    public void increaseMana(){
        mana+= 20;
    };

    public void meteorShower(){
        System.out.println("Casting MeteorShower!!!");
    }

    public void comet(){
        System.out.println("Casting Comet!!!");
    }
    public void manaShield(){
        System.out.println("Casting ManaShield!!!");
    }
}
