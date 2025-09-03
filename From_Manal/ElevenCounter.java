//Recursion-1 > array11
public class ElevenCounter {

    // Recursive method to count how many times 11 appears starting from a given index
    public static int countElevens(int[] numbers, int currentIndex) {
        // if we reached the end of the array
        if (currentIndex >= numbers.length) {
            return 0;
        }

        // If current element is 11, count it and recurse on the rest
        if (numbers[currentIndex] == 11) {
            return 1 + countElevens(numbers, currentIndex + 1);
        } else {
            return countElevens(numbers, currentIndex + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(countElevens(new int[]{1, 2, 11, 1, 0}));
        System.out.println(countElevens(new int[]{11, 11, 1, 0}));
        System.out.println(countElevens(new int[]{1, 2, 3, 4}));
    }
}