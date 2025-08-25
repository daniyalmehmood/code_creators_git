public class ArrayCheck {

    // a value followed immediately by that value * 10
    public boolean hasFollowedByTenTimes(int[] numbers, int startIndex) {

        if (startIndex >= numbers.length - 1) {
            return false;
        }

        // Check if the next element is exactly 10 times the current element
        if (numbers[startIndex + 1] == numbers[startIndex] * 10) {
            return true;
        }

        // move to the next index and keep checking
        return hasFollowedByTenTimes(numbers, startIndex + 1);
    }

    public static void main(String[] args) {
        ArrayCheck checker = new ArrayCheck();

        System.out.println(checker.hasFollowedByTenTimes(new int[]{1, 2, 20}, 0));
        System.out.println(checker.hasFollowedByTenTimes(new int[]{3, 30}, 0));
        System.out.println(checker.hasFollowedByTenTimes(new int[]{3}, 0));
    }
}