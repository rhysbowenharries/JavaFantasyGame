package Fighters;

import elements.Element;
import interfaces.IEnchantable;
import weapons.Weapon;

public abstract class Fighter implements IEnchantable {

    private int attackPower, weaponBonus, health;
    private Weapon weapon;
    protected Element element;
    private int bonus;
    private int enchantBonus;

    public Fighter(int attackPower, Weapon weapon, int weaponBonus, Element element){
        this.attackPower = attackPower;
        this.health = 2;
        this.weaponBonus = 0;
        this.weapon = weapon;
        this.element = element;
        this.enchantBonus = 0;


    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public String getWeaponName(){ return this.weapon.getName();}

    public int getHealth(){
        return this.health;
    }

    public int getWeaponBonus(){
        return this.weaponBonus;
    }

    public void setHealth(int healthBoost){
        this.health += healthBoost;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
        this.weaponBonusAdd(10);
    }

    public void weaponBonusAdd(int bonus) {
        if(this.element == this.weapon.getElement()){
            this.weaponBonus += bonus;
        }
    }

    public int damageToEnemyCalculator(){
        return this.attackPower + this.weaponBonus + this.weapon.getAttackPower() + this.enchantBonus;
    }

    public Element getElement() {
        return this.element;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void levelUp(){
        this.health += 6;
        this.attackPower ++;
    }

    public void enchant(int enchantPower){
        this.enchantBonus = enchantPower;
    }
}

