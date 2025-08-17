public class MakeChocolate {
    public static int smallBarsForGoal(int small, int big, int goal) {
        int bigBars = goal / 5;
        int usedBig = Math.min(bigBars, big);
        int smallNeeded = goal - (usedBig * 5);
        if (smallNeeded > small) {
            return -1;
        }
        return smallNeeded;
    }

    public static void main(String[] args){
        System.out.println(smallBarsForGoal(4, 1, 9));
        System.out.println(smallBarsForGoal(4, 1, 10));
        System.out.println(smallBarsForGoal(4, 1, 7));
    }
}
