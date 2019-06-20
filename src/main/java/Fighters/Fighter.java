package Fighters;

import elements.Element;
import weapons.Weapon;

public abstract class Fighter {

    private int attackPower, weaponBonus, health;
    private Weapon weapon;
    protected Element element;

    public Fighter(int attackPower, Weapon weapon, int weaponBonus, Element element){
        this.attackPower = attackPower;
        this.health = 2;
        this.weaponBonus = weaponBonus;
        this.weapon = weapon;
        this.element = element;


    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public int getHealth(){
        return this.health;
    }

    public int getWeaponBonus(){
        return this.weaponBonus;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
        this.weaponBonusAdd();
    }

    private void weaponBonusAdd() {
        if(this.element == this.weapon.getElement()){
            this.weaponBonus += 10;
        }
    }

    public int damageToEnemyCalculator(){
        return this.attackPower + this.weaponBonus + this.weapon.getAttackPower();
    }

    public Element getElement() {
        return this.element;
    }
}

