public class DiceSumCalculator {
    public static int sumWithoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2)
        {
            if (die1 == 6) { //check if the die1 is 6 , make it 1
                die1 = 1;
            }
            else {
                die1 = die1 + 1; //otherwise increment die1 by 1
            }
        }
        return die1 + die2; // return die1+die2
    }
    public static void main(String[] args) {
        System.out.println(sumWithoutDoubles(2,3,true));
    }
}
