//Array-2 > more14
public class CompareOnesAndFours {

    public static boolean hasMoreOnesThanFours(int[] numbers) {
        int onesCount = 0;
        int foursCount = 0;

        // Loop through the array and count 1's and 4's
        for (int number : numbers) {
            if (number == 1) {
                onesCount++;
            } else if (number == 4) {
                foursCount++;
            }
        }

        // Return true if the count of 1's is greater than the count of 4's
        return onesCount > foursCount;
    }

    // Testing the method
    public static void main(String[] args) {
        System.out.println(hasMoreOnesThanFours(new int[]{1, 4, 1}));
        System.out.println(hasMoreOnesThanFours(new int[]{1, 4, 1, 4}));
        System.out.println(hasMoreOnesThanFours(new int[]{1, 1}));
    }
}