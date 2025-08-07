public class WithoutDoubles {

    public int calculateSumWithoutDoubles(int die1, int die2, boolean noDoubles) {

        int  sum=die1+die2;
        if (noDoubles && sum==12) return die1+1;
        if (noDoubles && (die1==die2) ) return sum+1;


        return sum;
    }

}
