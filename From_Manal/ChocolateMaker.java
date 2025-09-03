public class ChocolateMaker {

    public int makeChocolate(int small, int big, int goal) {
        // Use as many big bars as possible without exceeding goal
        int maxBigBarsUsed = Math.min(goal / 5, big);

        // Calculate remaining kilos after using big bars
        int remaining = goal - maxBigBarsUsed * 5;

        // Check if we have enough small bars to meet the remaining kilos
        if (remaining <= small) {
            return remaining;  // number of small bars to use
        } else {
            return -1;  // not possible to meet the goal
        }
    }


    public static void main(String[] args) {
        ChocolateMaker cm = new ChocolateMaker();
        System.out.println(cm.makeChocolate(4, 1, 9)); 
        System.out.println(cm.makeChocolate(4, 1, 10));
        System.out.println(cm.makeChocolate(4, 1, 7));  
    }
}