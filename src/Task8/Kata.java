package Task8;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        Fighter first, second;
        if (fighter1.name.equals(fighter2.name)) {
            return "the first attacker is undefined, the fighter names are the same";
        } else if (fighter1.name.equals(firstAttacker)) {
            first = fighter1;
            second = fighter2;
        } else if (fighter2.name.equals(firstAttacker)) {
            first = fighter2;
            second = fighter1;
        } else {
            return "wrong name of the first attacker";
        }

        while (true) {
            second.health -= first.damagePerAttack;
            if (second.health <= 0) {
                return first.name;
            }
            first.health -= second.damagePerAttack;
            if (first.health <= 0) {
                return second.name;
            }
        }
    }
}