public class BunnyEarsCalculator {

    // Function to calculate total ears of bunnies
    public static int calculateTotalEars(int numberOfBunnies) {
        // Base case: no bunnies → no ears
        if (numberOfBunnies == 0) {
            return 0;
        }
        // 2 ears for one bunny + ears of the remaining bunnies
        return 2 + calculateTotalEars(numberOfBunnies - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculateTotalEars(0));
        System.out.println(calculateTotalEars(1));
        System.out.println(calculateTotalEars(2));

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