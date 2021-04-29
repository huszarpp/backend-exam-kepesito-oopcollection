package hu.nive.ujratervezes.oopcollection.army;

abstract class MilitaryUnit {

    private int healthPoints;
    private int hitPoints;
    private boolean hasArmor;
    private boolean hasShield;

    MilitaryUnit(int healthPoints, int damagePoints, boolean hasArmor, boolean hasShield) {
        this.healthPoints = healthPoints;
        this.hitPoints = damagePoints;
        this.hasArmor = hasArmor;
        this.hasShield = hasShield;
    }

    int doDamage() {
        return hitPoints;
    }

    void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else if (hasArmor) {
            healthPoints -= damage / 2;
        } else {
            healthPoints -= damage;
        }
    }

    int getHitPoints() {
        return healthPoints;
    }

    int getRealHitPoints() {
        return hitPoints;
    }

    boolean isDeadOrIncapableOfFighting() {
        return healthPoints < 25;
    }
}
