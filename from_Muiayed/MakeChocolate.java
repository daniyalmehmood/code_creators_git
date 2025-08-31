public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        int useBig = Math.min(big, maxBig);
        int remaining = goal - (useBig * 5);
        if (remaining <= small) {
            return remaining;
        }
        return -1;
    }

    public static void main(String[] args) {
        MakeChocolate mc = new MakeChocolate();
        System.out.println(mc.makeChocolate(4, 1, 9));  // → 4
        System.out.println(mc.makeChocolate(4, 1, 10)); // → -1
        System.out.println(mc.makeChocolate(4, 1, 7));  // → 2
    }
}