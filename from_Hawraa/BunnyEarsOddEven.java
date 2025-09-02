// Recursion-1 > bunnyEars2
public class BunnyEarsOddEven {
    public int countBunnyEarsOddEven(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 3 + countBunnyEarsOddEven(bunnies - 1);
        } else {
            return 2 + countBunnyEarsOddEven(bunnies - 1);
        }
    }
}