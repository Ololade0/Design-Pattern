package DesignPuzzle;

public class Character {

    WeaponBehavior weaponBehavior;


    public void fight(){
        System.out.println("I can fight");
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior1){
        this.weaponBehavior = weaponBehavior1;
    }
}
