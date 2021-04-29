package hu.nive.ujratervezes.oopcollection.army;

abstract class MilitaryUnit {

    private int hitPoints;
    private int damagePoints;
    private boolean hasArmor;
    private boolean hasShield;

    MilitaryUnit(int hitPoints, int damagePoints, boolean hasArmor, boolean hasShield) {
        this.hitPoints = hitPoints;
        this.damagePoints = damagePoints;
        this.hasArmor = hasArmor;
        this.hasShield = hasShield;
    }

    int doDamage() {
        return damagePoints;
    }

    void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else if (hasArmor) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    int getDamagePoints() {
        return damagePoints;
    }

    int getHitPoints() {
        return hitPoints;
    }

    boolean isDeadOrIncapableOfFighting() {
        return hitPoints < 25;
    }
}
