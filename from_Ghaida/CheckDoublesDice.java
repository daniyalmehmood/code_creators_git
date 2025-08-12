public class CheckDoublesDice {
    public static void main(String[] args) {
        System.out.println(SumWithoutDoubles(2, 3, true));// → 5
        System.out.println(SumWithoutDoubles(3, 3, true));// → 7
        System.out.println(SumWithoutDoubles(3, 3, false));// → 6
    }
    public static int SumWithoutDoubles(int die1, int die2, boolean noDoubles) {
        int sumOfTwoSidedDice = die1 + die2;
        if(noDoubles && die1 == die2){
            if(die1 == 6){
                return 7;
            }
            return sumOfTwoSidedDice + 1;
        }
        return sumOfTwoSidedDice;
    }
}
