public class WithoutDoubles {
    public static int getDiceSumWithRules(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1;
            } else {
                die1++;
            }
        }
        return die1 + die2;
    }

    public static void main(String[] args) {
        System.out.println(getDiceSumWithRules(2, 3, true));
        System.out.println(getDiceSumWithRules(3, 3, true));
        System.out.println(getDiceSumWithRules(3, 3, false));
    }
}
