//Logic-1 > withoutDoubles

public class DiceSumCalculator {
    public int sumDice(int die1, int die2, boolean noDoubles) {
        if (!noDoubles) {
            if (die1 >= 1 && die1 <= 6 && die2 >= 1 && die2 <= 6) {
                return die1 + die2;
            }
            if (die1 == die2) {
                return 6;
            }
        } else {
            if (die1 == 6 && die2 == 6) {
                return 7;
            }
            if (die1 == die2) {
                die1++;
                return die1 + die2;
            }

        }
        return die1 + die2;
    }
}