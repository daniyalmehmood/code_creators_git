//Recursion-1 > bunnyEars2

public class BunnyEarsCalculatorAdvanced {
    public int calculateBunnyEars(int bunnies) {
        if (bunnies > 0) {
            if (bunnies % 2 == 0) {
                return 3 + calculateBunnyEars(bunnies - 1);
            } else {
                return 2 + calculateBunnyEars(bunnies - 1);
            }
        }

        return 0;

    }
}