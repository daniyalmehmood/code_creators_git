public class DiceGame {
    public int sumWithoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1;
            } else {
                die1 = die1 + 1;
            }
        }
        //Return the sum of two 6-sided dice rolls
        return die1 + die2;
    }
}
