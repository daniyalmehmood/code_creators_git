public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1+ die2;
        if (noDoubles && die1==6 && die1==die2) return die1+1;
        if (noDoubles && die1==die2) return sum+1;
        return sum;

    }

}
