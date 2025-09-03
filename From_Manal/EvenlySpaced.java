import java.util.Arrays;

public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {
        // Put the numbers in an array
        int[] nums = {a, b, c};
        // Sort the array to identify small, medium, large
        Arrays.sort(nums);
        // Check if difference between small and medium equals difference between medium and large
        return (nums[1] - nums[0]) == (nums[2] - nums[1]);
    }


    public static void main(String[] args) {
        EvenlySpaced es = new EvenlySpaced();
        System.out.println(es.evenlySpaced(2, 4, 6)); // true
        System.out.println(es.evenlySpaced(4, 6, 2)); // true
        System.out.println(es.evenlySpaced(4, 6, 3)); // false
    }
}