package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int healthPoints;
    private int hitPoints;
    private boolean hasArmor;
    private boolean hasShield;

    public MilitaryUnit(int healthPoints, int damagePoints, boolean hasArmor, boolean hasShield) {
        this.healthPoints = healthPoints;
        this.hitPoints = damagePoints;
        this.hasArmor = hasArmor;
        this.hasShield = hasShield;
    }

    public int doDamage() {
        return hitPoints;
    }

    public void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else if (hasArmor) {
            healthPoints -= damage / 2;
        } else {
            healthPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
