public class SumWithoutDoubles {
    public static int sumwithoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles && die1 == die2) {
            if (sum == 12) return die1 + 1;
            else return sum + 1;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumwithoutDoubles(2, 3, true));
        System.out.println(sumwithoutDoubles(3, 3, true));
        System.out.println(sumwithoutDoubles(3, 3, false));
    }
}
