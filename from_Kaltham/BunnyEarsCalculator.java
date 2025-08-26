//Recursion-1 > bunnyEars

public class BunnyEarsCalculator {
    public int calculateBunnyEars(int bunnies) {

        if (bunnies > 0) {

            return 2 + bunnyEars(bunnies - 1);
        } else {
            return 0;
        }
    }
}