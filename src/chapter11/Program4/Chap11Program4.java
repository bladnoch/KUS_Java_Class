package chapter11.Program4;

/**
 * Chapt11Program4.java
 * @author DounukKim
 * @version v0.1
 * @since 5-1-2023
 */
public class Chap11Program4 {
    public static void main(String[] args){

        showDamage(new Weapon());
        showDamage(new WidowWeaponSniper());
        showDamage(new DoomfistWeapon());

//        Weapon weapon;

//        weapon =new Weapon();
//        System.out.println("Minimum damage: "+weapon.fire());

//        weapon =new WidowWeaponSniper();
//        System.out.println("Widow's damage: "+weapon.fire());

//        weapon =new DoomfistWeapon();
//        System.out.println("Doomfist's damage: "+weapon.fire());


    }
    static void showDamage(Weapon weapon){
        System.out.println(weapon.fire());
    }
}
