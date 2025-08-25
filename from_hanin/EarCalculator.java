//Recursion-1 > bunnyEars
public class EarCalculator {
    public int calculateTotalEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + calculateTotalEars(bunnies - 1);
    }
}

