public class DiceValues {
    public int checkEqualityOfDicesValues(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles && die1 == die2) {
            if (sum == 12) return die2 + 1;
            else return sum + 1;
        }
        return sum;
    }

}
