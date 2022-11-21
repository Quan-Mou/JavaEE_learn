package pers.quan.factorymethods;

public class client {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory();
        Weapon tank = weaponFactory.get();
        tank.attack();
    }
}
