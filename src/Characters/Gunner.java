package Characters;

import Characters.Interface.Ranger;
import Equipments.Equipment;

import java.util.HashMap;

public class Gunner extends  Character implements Ranger {
    public Gunner(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }

    public void doubleShot(){
        attack *= 2;
    };

    public void increaseSpeed(){
        runSpeed += 10;
    }
}
