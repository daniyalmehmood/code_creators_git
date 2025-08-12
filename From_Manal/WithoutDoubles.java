public class WithoutDoubles {
    public static int getSum(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) die1 = (die1 == 6) ? 1 : die1 + 1;
        return die1 + die2;
    }
    public static void main(String[] args) {
        System.out.println(getSum(2, 3, true));  // 5
        System.out.println(getSum(3, 3, true));  // 7
        System.out.println(getSum(6, 6, true));  // 7
    }
}