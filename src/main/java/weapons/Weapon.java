package weapons;

import elements.Element;
import interfaces.IEnchantable;

public abstract class Weapon implements IEnchantable {

    private int attackPower;
    private Element element;
    private String name;

    public Weapon(int attackPower, Element element, String name){
        this.attackPower = attackPower;
        this.element = element;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public Element getElement(){
        return this.element;
    }

    public void enchant(int i) {

    }
}
