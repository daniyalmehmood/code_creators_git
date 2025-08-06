//  A class to check if the first element of given arrays equals 1
public class FirstElementChecker {

    public static int countArraysStartingWithOne(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }

        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countArraysStartingWithOne(new int[]{1, 2, 3}, new int[]{1, 3})); // 2
        System.out.println(countArraysStartingWithOne(new int[]{7, 2, 3}, new int[]{1}));     // 1
        System.out.println(countArraysStartingWithOne(new int[]{1, 2}, new int[]{}));         // 1
    }
}
