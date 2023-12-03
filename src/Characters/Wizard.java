package Characters;

import Characters.Interface.Mage;
import Equipments.Equipment;

import java.util.HashMap;

public class Wizard extends  Character implements Mage {
    public Wizard(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }
    public void castSpell(String skillName , Character target) {
        if(skillName == "meteorShower") meteorShower(target);
        if(skillName == "comet") comet(target);
        if(skillName == "manaShield") manaShield();
    };

    public void increaseMana(){
        mana+= 20;
    };

    public void meteorShower(Character target ){
        int trueDamage = this.level * 50;
        target.hp -= trueDamage;
        if(target.hp <= 0 ) target.hp = 0 ;
        System.out.println("Casting MeteorShower!!!");
    }

    public void comet(Character target){
        int trueDamage = this.level * 100;
        target.hp -= trueDamage;
        if(target.hp <= 0 ) target.hp = 0 ;
        System.out.println("Casting Comet!!!");
    }
    public void manaShield(){
        def += 20;
        System.out.println("Casting ManaShield!!!");
    }
}
