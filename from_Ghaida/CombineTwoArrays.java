public class CombineTwoArrays {
    public static void main(String[] args) {
        System.out.println(addTwoArrays([1, 2], [3, 4]));// → [1, 2, 3, 4]
        System.out.println(addTwoArrays([4, 4], [2, 2]));// → [4, 4, 2, 2]
        System.out.println(addTwoArrays([9, 2], [3, 4]));// → [9, 2, 3, 4]);
    }
    public static int[] addTwoArrays(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }
}
