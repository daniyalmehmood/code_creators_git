//Logic-2 > makeChocolate


public class ChocolateMaker {
    public int makeChocolate(int small, int big, int goal) {

        int bigUse = Math.min(big, goal / 5);
        int reminder = goal - (bigUse * 5);
        if (reminder <= small) {
            return reminder;

        }
        return -1;
    }
}