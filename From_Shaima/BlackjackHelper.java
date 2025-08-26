public class BlackjackHelper {
    public static int blackjackValue(int a, int b) {
        if (a<=21 && b>21)return a; // return a while is it 21 or less and b is more than 21
        if (b<=21 && a>21)return b; // return b while is it 21 or less and a is more than 21
        if (a>21 && b>21)return 0; // return 0 while both are greater than 21
        return Math.max(a,b); // return which value is higher if both are less than 21
    }
    public static void main(String[] args) {
        System.out.println(blackjackValue(19,21));
    }
}
