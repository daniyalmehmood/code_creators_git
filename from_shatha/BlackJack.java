public class BlackJack {
    public static int getClosestToTwentyOne(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else {
            return (a > b) ? a : b;
        }
    }
        public static void main (String[]args){
            System.out.println(getClosestToTwentyOne(19, 21));
            System.out.println(getClosestToTwentyOne(21, 19));
            System.out.println(getClosestToTwentyOne(19, 22));
        }
}
