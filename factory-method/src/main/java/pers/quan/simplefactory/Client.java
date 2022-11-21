package pers.quan.simplefactory;

public class Client {
    public static void main(String[] args) {
        Weapon weapon = WeaponFactory.get("Fighter");
        weapon.attack();
        Weapon weapon1 = WeaponFactory.get("Tank");
        weapon1.attack();
        Weapon weapon2 = WeaponFactory.get("Dagger");
        weapon2.attack();
    }
}
