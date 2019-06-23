package enemy.stuff;

import elements.Element;
import interfaces.IEnchantable;

public abstract class Enemy implements IEnchantable {

    private int attackPower, health;
    private Element element;
    private String weakness;

    public Enemy(int attackPower, int health, Element element, String weakness){
        this.attackPower = attackPower;
        this.health = health;
        this.element = element;
        this.weakness = weakness;

    }


    public int getAttackPower() {
        return attackPower;
    }

    public int getHealth() {
        return health;
    }

    public Element getElement() {
        return element;
    }

    public String getWeakness() {
        return weakness;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void enchant(int enchantPower) {

    }
}
