package pers.quan.simplefactory;

public class WeaponFactory {

    /**
     *
     * 武器工厂类
     */

    public static Weapon get(String weaponType) {
        if (weaponType == null) {
            return null;
        }
        Weapon weapon = null;

        if ("Tank".equals(weaponType)) {
            weapon = new Tank();
        } else if("Dagger".equals(weaponType)) {
            weapon = new Dagger();
        } else if("Fighter".equals(weaponType)) {
            weapon = new Fighter();
        }
        return weapon;
    }
}
