public class NumberArrayGenerator {//Array-2 > fizzArray
    public static void main(String[] args) {
        System.out.println(generateNumberSequence(4));// → [0, 1, 2, 3]
        System.out.println(generateNumberSequence(1));// → [0]
        System.out.println(generateNumberSequence(10));// → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
    public static int[] generateNumberSequence(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
}