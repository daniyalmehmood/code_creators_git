public class Blackjack {

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0; // both go over 21
        }
        if (a > 21) {
            return b; // only a goes over
        }
        if (b > 21) {
            return a; // only b goes over
        }
        // both are 21 or below, return the one closer to 21
        return (21 - a) <= (21 - b) ? a : b;
    }


    public static void main(String[] args) {
        Blackjack bj = new Blackjack();
        System.out.println(bj.blackjack(19, 21)); // 21
        System.out.println(bj.blackjack(21, 19)); // 21
        System.out.println(bj.blackjack(19, 22)); // 19
        System.out.println(bj.blackjack(22, 23)); // 0
    }
}