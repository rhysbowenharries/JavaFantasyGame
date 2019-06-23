package room.stuff;

import Fighters.Barbarian;
import Fighters.Dwarf;
import Fighters.Fighter;
import Fighters.Knight;
import enemy.stuff.ChickEnemy;
import enemy.stuff.TheBlackKnight;
import weapons.Pillow;
import weapons.Sword;
import weapons.WaterBalloon;
import weapons.Weapon;

import java.util.HashMap;

public class KnightRoom {
    private BattleArena battleArena;
    private HashMap<String, Weapon> weaponChest;
    private ChickEnemy chickEnemy;
    private Dwarf dwarf;
    private Barbarian barbarian;
    private Knight knight;
    private Pillow pillow;
    private WaterBalloon waterBalloon;
    private Sword sword;
    private TheBlackKnight theBlackKnight;


    public KnightRoom(){

        this.theBlackKnight = new TheBlackKnight();
        this.sword = new Sword();
        this.chickEnemy = new ChickEnemy();
        this.pillow = new Pillow();
        this.waterBalloon = new WaterBalloon();
        this.dwarf = new Dwarf(pillow);
        this.barbarian = new Barbarian(pillow);
        this.knight = new Knight(pillow);
        this.weaponChest = new HashMap<String, Weapon>();

        weaponChest.put(pillow.getName(), pillow);
        weaponChest.put(waterBalloon.getName(), waterBalloon);
        weaponChest.put(sword.getName(), sword);

    }

//    Congratulations on defeating that ferocious chicken. Something telles me that the enemy you see
//    before you... The Black Knight, wont be such a push-over....Lucky for you the new weapon you have in your posetion will prove
//    very valuable... provided it is in the rights hands....


    public void battle(Fighter chosen) {



        this.chosen.setWeapon(sword);


        battleArena = new BattleArena(theBlackKnight, fighter);

        String result = battleArena.roundOfFighting();
        if (result == "Next round:") {
            System.out.println("Enemy Health:" + this.theBlackKnight.getHealth());
            System.out.println("Your Health:" + fighter.getHealth());
            battleArena.roundOfFighting();
        }
        if (result == "You are defeated. GAME OVER") {
            System.out.println("You are defeated. GAME OVER");
        }
        if (result == "Enemy Defeated") {
            System.out.println("Enemy Defeated: The cage opens and the Warlock is free! " +
                    "But something tells me we haven't seen the last of the Black Knight...");
        }

    }
}
