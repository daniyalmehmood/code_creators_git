public class WithoutDoubles {
    public int sumWithoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1 == 6 && die2 == 6 && noDoubles) {
            return die2 + 1;
        }
        if (die1 >= 1 && die1 <= 6 && die2 >= 1 && die2 <= 6 && noDoubles && die1 == die2) {
            return die1 + die2 + 1;
        }
        if (die1 >= 1 && die1 <= 6 && die2 >= 1 && die2 <= 6 && noDoubles) {
            return die1 + die2;
        }
        return die1 + die2;
    }
}