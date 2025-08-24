//Recursion-1 > bunnyEars2
public class BunnyEarsCalculator {

    // Method to calculate total ears in a line of bunnies
    public static int calculateBunnyEars(int bunnyNumber) {
        // no bunnies → 0 ears
        if (bunnyNumber == 0) {
            return 0;
        }

        if (bunnyNumber % 2 == 0) {
            return 3 + calculateBunnyEars(bunnyNumber - 1);
        } else {
            return 2 + calculateBunnyEars(bunnyNumber - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateBunnyEars(0));
        System.out.println(calculateBunnyEars(1));
        System.out.println(calculateBunnyEars(2));
    }
}