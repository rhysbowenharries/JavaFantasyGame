package room.stuff;

import Fighters.Barbarian;
import Fighters.Dwarf;
import Fighters.Fighter;
import Fighters.Knight;
import enemy.stuff.ChickEnemy;
import weapons.Pillow;
import weapons.WaterBalloon;
import weapons.Weapon;

import java.util.HashMap;

//fight defeat chickenemy, win Steal Sword

public class ChickenRoom {
   private BattleArena battleArena;
   private HashMap<String, Weapon> weaponChest;
   private ChickEnemy chickEnemy;
   private Dwarf dwarf;
   private Barbarian barbarian;
   private Knight knight;
   private Pillow pillow;
   private WaterBalloon waterBalloon;


   public ChickenRoom(){
      this.chickEnemy = new ChickEnemy();
      this.pillow = new Pillow();
      this.waterBalloon = new WaterBalloon();
      this.dwarf = new Dwarf(pillow);
      this.barbarian = new Barbarian(pillow);
      this.knight = new Knight(pillow);
      this.weaponChest = new HashMap<String, Weapon>();
      weaponChest.put(pillow.getName(), pillow);
      weaponChest.put(waterBalloon.getName(), waterBalloon);

   }

//   As the trio enter the room, they notice a shiny looking steal sword, and a fierce and angry
//   looking chicken blocking their path to what will almost certainly aid in their quest.
//   it is in your hands to choose who will do battle with chickenemy...

   public void battle(Fighter fighter){

      battleArena = new BattleArena(chickEnemy, fighter);
      String result = battleArena.roundOfFighting();
      if (result == "Next round:"){
         System.out.println("Chickenemy Health:" + this.chickEnemy.getHealth());
         System.out.println("Your Health" + fighter.getHealth());
         battleArena.roundOfFighting();
      } if (result == "You are defeated. GAME OVER"){
         System.out.println("You are defeated. GAME OVER");
      } if (result == "Enemy Defeated"){
         System.out.println("Enemy Defeated: The Steal Sword is Yours!!!");
      }

   }

}
