public class EvenNumbersCounter {

    // Method to count the number of even integers in the array
    public static int countEvens(int[] numbers) {
        int count = 0; // Counter for even numbers

        // Loop through each number in the array
        for (int num : numbers) {
            // Check if the number is even using modulo operator
            if (num % 2 == 0) {
                count++; // Increase the counter if number is even
            }
        }

        return count; // Return the total count of even numbers
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[] {2, 2, 0}));
        System.out.println(countEvens(new int[] {1, 3, 5}));
    }
}











public class SumWithoutUnluckyOneThree {
    // Method to calculate the sum, skipping 13 and the number right after it
    public static int sumWithout13(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) {
                i++;
            } else {
                sum += numbers[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumWithout13(new int[]{1, 2, 2, 1}));
        System.out.println(sumWithout13(new int[]{1, 1}));
        System.out.println(sumWithout13(new int[]{1, 2, 2, 1, 13}));
    }
}



public class Lucky13Checker {
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












public class FizzArrayGenerator {
    // Method to create an array containing numbers 0 to n-1
    public static int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzArray(4)));
        System.out.println(java.util.Arrays.toString(fizzArray(1)));
        System.out.println(java.util.Arrays.toString(fizzArray(10)));
    }
}








public class NoOneOrFour {
    // Method to check if the array contains no 1's or no 4's
    public static boolean hasNoOneOrNoFour(int[] numbers) {
        boolean foundOne = false;
        boolean foundFour = false;

        for (int num : numbers) {
            if (num == 1) {
                foundOne = true;
            }
            if (num == 4) {
                foundFour = true;
            }
        }

        // Return true if there is no 1 or no 4
        return !foundOne || !foundFour;
    }
    public static void main(String[] args) {
        System.out.println(hasNoOneOrNoFour(new int[]{1, 2, 3}));
        System.out.println(hasNoOneOrNoFour(new int[]{1, 2, 3, 4}));
        System.out.println(hasNoOneOrNoFour(new int[]{2, 3, 4}));
    }
}







public class MatchUpCounter {
    // Method to count how many pairs have a difference of 2 or less but are not equal
    public static int countCloseButNotEqual(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int difference = Math.abs(nums1[i] - nums2[i]);

            // Check if the numbers are close (difference <= 2) and not equal
            if (difference <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCloseButNotEqual(
                new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(countCloseButNotEqual(
                new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(countCloseButNotEqual(
                new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}









public class ConsecutiveNumbersChecker {

    public static boolean hasThreeConsecutiveEvenOrOdd(int[] numbers) {
        // Loop through the array, stopping 2 elements before the end
        for (int i = 0; i < numbers.length - 2; i++) {
            // Check if three consecutive numbers are all even
            if (numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0 && numbers[i+2] % 2 == 0) {
                return true;
            }
            // Check if three consecutive numbers are all odd
            if (numbers[i] % 2 != 0 && numbers[i+1] % 2 != 0 && numbers[i+2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5};
        int[] arr2 = {2, 1, 2, 5};
        int[] arr3 = {2, 4, 2, 5};

        System.out.println(hasThreeConsecutiveEvenOrOdd(arr1));
        System.out.println(hasThreeConsecutiveEvenOrOdd(arr2));
        System.out.println(hasThreeConsecutiveEvenOrOdd(arr3));
    }
}













public class ArrayEndsChecker {
    public static boolean sameEnds(int[] numbers, int n) {
        // Check if n is valid
        if (n < 0 || n > numbers.length) {
            return false;
        }

        // Compare first n elements with last n elements
        for (int i = 0; i < n; i++) {
            if (numbers[i] != numbers[numbers.length - n + i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 6, 45, 99, 13, 5, 61, 1};
        int[] arr2 = {5, 6, 45, 99, 13, 5, 6};
        int[] arr3 = {5, 6, 45, 99, 13, 5, 6};

        System.out.println(sameEnds(arr1, 5));
        System.out.println(sameEnds(arr2, 2));
        System.out.println(sameEnds(arr3, 3));
    }
}














public class ArrayShifter {

    public static int[] shiftLeft(int[] numbers) {
        // If array has 0 or 1 element, no shift is needed
        if (numbers.length <= 1) {
            return numbers;
        }

        int first = numbers[0];
        // Shift all elements to the left by one
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = first;
        return numbers;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};

        System.out.println(java.util.Arrays.toString(shiftLeft(arr1)));
        System.out.println(java.util.Arrays.toString(shiftLeft(arr2)));
        System.out.println(java.util.Arrays.toString(shiftLeft(arr3)));
    }
}














public class AfterFourExtractor {
    public static int[] post4(int[] numbers) {
        int lastIndexOf4 = -1;

        // Find the index of the last 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                lastIndexOf4 = i;
            }
        }

        // If no 4 is found, return an empty array
        if (lastIndexOf4 == -1 || lastIndexOf4 == numbers.length - 1) {
            return new int[0];
        }

        // Create a new array for elements after the last 4
        int[] result = new int[numbers.length - lastIndexOf4 - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[lastIndexOf4 + 1 + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 2};
        int[] arr2 = {4, 1, 4, 2};
        int[] arr3 = {4, 4, 1, 2, 3};

        System.out.println(java.util.Arrays.toString(post4(arr1)));
        System.out.println(java.util.Arrays.toString(post4(arr2)));
        System.out.println(java.util.Arrays.toString(post4(arr3)));
    }
}







public class RemoveTens {

    public static int[] withoutTen(int[] numbers) {
        int index = 0;

        // Move non-10 elements to the front
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 10) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        for (int i = index; i < numbers.length; i++) {
            numbers[i] = 0;
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        System.out.println(java.util.Arrays.toString(withoutTen(arr1)));
        System.out.println(java.util.Arrays.toString(withoutTen(arr2)));
        System.out.println(java.util.Arrays.toString(withoutTen(arr3)));
    }
}





public class FizzBuzzArray {

    public static String[] fizzBuzz(int start, int end) {
        int length = end - start; // Length of the resulting array
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            int num = start + i;

            if (num % 3 == 0 && num % 5 == 0) {
                result[i] = "FizzBuzz"; // Multiples of both 3 and 5
            } else if (num % 3 == 0) {
                result[i] = "Fizz"; // Multiples of 3
            } else if (num % 5 == 0) {
                result[i] = "Buzz"; // Multiples of 5
            } else {
                result[i] = String.valueOf(num); // Other numbers
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 6)));  // ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 8)));  // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 11))); // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    }
}
