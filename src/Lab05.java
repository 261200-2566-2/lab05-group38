import Characters.Archer;
import Characters.Character;
import Characters.Swordman;
import Characters.Wizard;
import Equipments.Equipment;
import Equipments.Sword;

import java.util.HashMap;

public class Lab05 {
    public static void main(String[] args) {
        HashMap<Character.PartType,Equipment> equipmentMap = new HashMap<Character.PartType, Equipment>();
        // Testing class that implement ranger interface
        Archer archer = new Archer(1, 100, 100, 5, 10,5,equipmentMap);
        archer.doubleShot();
        System.out.println("Archer attack after using double shot = " + archer.getAttack());
        archer.increaseSpeed();
        System.out.println("Archer runSpeed after using double shot = " + archer.getRunSpeed());

        // Testing class that implement ranger interface
        Wizard wizard = new Wizard(1, 100, 100, 5, 10,5,equipmentMap);
        wizard.castSpell("meteorShower");
        wizard.increaseMana();
        System.out.println("Wizard runSpeed after using double shot = " + wizard.getMana());

        // Testing class that implement ranger interface
        Swordman swordman = new Swordman(1, 100, 100, 5, 10,5,equipmentMap);
        swordman.boostAttack();
        System.out.println("Swordman attack after using boost attack = " + swordman.getAttack());
        swordman.defend();
        System.out.println("Swordman runSpeed after using defend = " + swordman.getDef());


    }
}