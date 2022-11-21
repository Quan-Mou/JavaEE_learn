package pers.quan.factorymethods;

public class WeaponFactory {

    public Weapon get() {
        Tank tank = new Tank();
        return tank;
    }
}
