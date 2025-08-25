public class Fix34 {
    public static int[] fix34(int[] nums) {
        int[] arr = nums.clone();
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 3 && arr[i + 1] != 4) {
                // find the next 4 that is not directly after a 3
                while (j < arr.length && (arr[j] != 4 || (j > 0 && arr[j - 1] == 3))) {
                    j++;
                }
                // swap the 4 into position i+1
                int temp = arr[i + 1];
                arr[i + 1] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    // quick sanity check
    public static void main(String[] args) {
        java.util.function.Consumer<int[]> print =
                a -> System.out.println(java.util.Arrays.toString(a));

        print.accept(fix34(new int[]{1, 3, 1, 4}));          // [1, 3, 4, 1]
        print.accept(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})); // [1, 3, 4, 1, 1, 3, 4]
        print.accept(fix34(new int[]{3, 2, 2, 4}));          // [3, 4, 2, 2]
    }
}