package chapter11;

/**
 *
 * Chapt11Program4.java
 * @author DounukKim
 * @version v0.1
 * @since 5-1-2023
 */
public class Chap11Program4 {
    public static void main(String[] args){
        Weapon weapon;
        weapon =new Weapon();
        System.out.println("minimum damage: "+weapon.fire());
        weapon =new WidowWeaponSniper();
        System.out.println("widow's damage: "+weapon.fire());
        weapon =new DoomfistWeapon();
        System.out.println("Doomfist's damage: "+weapon.fire());
    }
}
