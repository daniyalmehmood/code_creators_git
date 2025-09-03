public class LuckyOneThreeChecker {
    // Method to check if array has no 1's and no 3's
    public static boolean lucky13(int[] numbers) {
        for (int num : numbers) {
            if (num == 1 || num == 3) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));
    }
}