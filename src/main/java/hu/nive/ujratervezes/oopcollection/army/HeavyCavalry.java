package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean isFirstAttack = true;

    public HeavyCavalry() {
        super(150, 20, true, false);
    }

    @Override
    public int doDamage() {
        if (isFirstAttack) {
            isFirstAttack = false;
            return getHitPoints() * 3;
        } else {
            return getHitPoints();
        }
    }
}