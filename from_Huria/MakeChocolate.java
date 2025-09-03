public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int bigBar = goal / 5;
        int smallBar;
        if (bigBar >= big) {
            smallBar = goal - (big * 5);
        } else {
            smallBar = goal - (bigBar * 5);
        }
        if (smallBar <= small) {
            return smallBar;
        }
        if (smallBar > small) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }
}
