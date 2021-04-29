package hu.nive.ujratervezes.oopcollection.army;

class HeavyCavalry extends MilitaryUnit {

    private boolean isFirstAttack = true;

    HeavyCavalry() {
        super(150, 20, true, false);
    }

    @Override
    int doDamage() {
        if (isFirstAttack) {
            isFirstAttack = false;
            return getRealHitPoints() * 3;
        } else {
            return getRealHitPoints();
        }
    }
}