package Characters;

import Characters.Interface.Mage;
import Equipments.Equipment;

import java.util.HashMap;
import java.util.Scanner;

public class Necromancer extends  Character implements Mage {
    String[] skillTree ;
    String[] minionTree ;
    public Necromancer(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
        skillTree = new String[4];
        minionTree = new String[10];
    }

    public void castSpell(String skillName) {
        if(skillName == "summonMinion") {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name of the minion to summon:");
            String minionName = scanner.nextLine();

            summonMinion(minionName);
            scanner.close();
        }
        if(skillName == "fireball") fireball();
        if(skillName == "iceBlast") iceBlast();
        if(skillName == "teleport") teleport();
    };

    public void increaseMana(){
            mana +=  20;
    };

    public void summonMinion (String minionName ) {}
    public void fireball () {}
    public void iceBlast () {}
    public void teleport () {}


}
