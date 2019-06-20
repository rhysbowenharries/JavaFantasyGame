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

    public void fighterAttcks(){
        fight = this.fighter.damageToEnemyCalculator();
        this.enemy.takeDamage(fight);

    }
}
