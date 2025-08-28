import java.util.Arrays;

public class Fix45 {
    public static int[] fix45(int[] nums) {
        int[] arr = nums.clone();
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 4 && arr[i + 1] != 5) {
                // locate the next 5 that is NOT directly after a 4
                while (j < arr.length && (arr[j] != 5 || (j > 0 && arr[j - 1] == 4))) {
                    j++;
                }
                // swap that 5 into position i+1
                int temp = arr[i + 1];
                arr[i + 1] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5})));
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }
}