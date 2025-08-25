//Array-3 > canBalance
public class ArrayBalanceChecker {

    // Method to check if array can be split into two equal sum parts
    public static boolean canBalance(int[] numbers) {
        int totalSum = 0;

        //  Calculate total sum of the array
        for (int num : numbers) {
            totalSum += num;
        }

        int leftSum = 0;

        //  Check each possible split point
        for (int i = 0; i < numbers.length - 1; i++) {
            leftSum += numbers[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true; // Found a split point
            }
        }

        return false; // No split point found
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));   
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));   
        System.out.println(canBalance(new int[]{10, 10}));       
    }
}