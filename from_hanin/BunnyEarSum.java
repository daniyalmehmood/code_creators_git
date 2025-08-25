//Recursion-1 > bunnyEars2
public class BunnyEarSum {
    public int countBunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 3 + countBunnyEars(bunnies - 1);
        } else {
            return 2 + countBunnyEars(bunnies - 1);
        }
    }

}

