package creatures;

import Fighters.Fighter;
import elements.Element;
import interfaces.IEnchantable;

public abstract class Creatures implements IEnchantable {

    private int healthBoost;
    private Element element;
    private Fighter fighter;

    public Creatures(int healthBoost, Element element){
        this.healthBoost = healthBoost;
        this.element = element;
    }

    public void giveHealthBoost(Fighter fighter){
        if(this.element == fighter.getElement()){
            fighter.setHealth(this.healthBoost);
        }
    }

    public Element getElement(){
        return this.element;
    }




}
