TRA-3886-BunnyEars
//Recursion-1 > bunnyEars
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
    }
}
