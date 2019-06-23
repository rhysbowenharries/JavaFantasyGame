package room.stuff;

import Fighters.Fighter;
import enemy.stuff.Enemy;

public class BattleArena {

    Enemy enemy;
    Fighter fighter;
    int fight;

    public BattleArena(Enemy enemy, Fighter fighter){
        this.enemy = enemy;
        this.fighter = fighter;
    }

    public void fighterAttacks(){
        fight = this.fighter.damageToEnemyCalculator();
        if(this.enemy.getWeakness() == this.fighter.getWeaponName()){
            fight = 10000;
        }
        this.enemy.takeDamage(fight);

    }

    public void enemyAttacks() {
        fight = this.enemy.getAttackPower();
        this.fighter.takeDamage(fight);
    }

    public String enemyDefeated() {
        if (this.enemy.getHealth() < 1){
            return "Enemy Defeated";
        } return "Monster Looks Angry";
    }

    public String roundOfFighting() {

         this.fighterAttacks();
        if (this.enemy.getHealth() < 1){
            return "Enemy Defeated";
        } else this.enemyAttacks();
        if (this.fighter.getHealth() < 1) {
            return "You are defeated. GAME OVER";
        } else return "Next round:";


    }
}
