package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

class Army {

    List<MilitaryUnit> militaryUnitsOfArmy = new ArrayList<>();

    void addUnit(MilitaryUnit militaryUnit) {
        militaryUnitsOfArmy.add(militaryUnit);
    }

    void damageAll(int damage) {
        for (int i = 0; i < militaryUnitsOfArmy.size(); i++) {
            militaryUnitsOfArmy.get(i).sufferDamage(damage);
            if (militaryUnitsOfArmy.get(i).isDeadOrIncapableOfFighting()) {
                militaryUnitsOfArmy.remove(i);
                i--;
            }
        }
    }

    int getArmyDamage() {
        int sumOfDamage = 0;
        for (MilitaryUnit militaryUnit : militaryUnitsOfArmy) {
            sumOfDamage += militaryUnit.doDamage();
        }
        return sumOfDamage;
    }

    int getArmySize() {
        return militaryUnitsOfArmy.size();
    }
}