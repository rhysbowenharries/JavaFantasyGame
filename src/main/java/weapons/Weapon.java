package weapons;

import elements.Element;

public abstract class Weapon {

    private int attackPower;
    private Element element;

    public Weapon(int attackPower, Element element){
        this.attackPower = attackPower;
        this.element = element;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public Element getElement(){
        return this.element;
    }
}
