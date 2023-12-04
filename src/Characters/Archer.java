package Characters;

import Characters.Interface.Ranger;
import Equipments.Equipment;

import java.util.HashMap;

public class Archer extends  Character implements Ranger {

    public Archer(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }


    public void doubleShot(Character target){
        int damage = attack * 2 ;
        target.hp -= damage;
        if(target.getHp() <= 0 ) target.hp = 0;
    };

    public void increaseSpeed(){
        runSpeed += 10;
    }
}
