public class ChocolateMaker {
    public static void main(String[] args) {
        System.out.println(calculateBarsNeeded(4, 1, 9));//4
        System.out.println(calculateBarsNeeded(4, 1, 10));//-1
        System.out.println(calculateBarsNeeded(4, 1, 7));//2
    }
    public static int calculateBarsNeeded(int small, int big, int goal) {
        int maxBigBarsOfChocolate = Math.min(big, goal / 5);
        if (goal - (maxBigBarsOfChocolate * 5) <= small) {
            return goal - (maxBigBarsOfChocolate * 5); //return the number of small bars needed
        }
        return -1; // can not meet the goal
    }
}
