public class ArrayBalanceChecker {
    public boolean isBalanced(int[] numbers) {
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        int sumLeft = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumLeft += numbers[i];
            int sumRight = totalSum - sumLeft;
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }
}
