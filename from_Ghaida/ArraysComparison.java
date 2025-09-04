public class ArraysComparison {
    public static void main(String[] args) {
        System.out.println(largerSumOfArray(new int[]{1, 2}, new int[]{3, 4})); //[3, 4]
        System.out.println(largerSumOfArray(new int[]{3, 4}, new int[]{1, 2})); //[3, 4]
        System.out.println(largerSumOfArray(new int[]{1, 1}, new int[]{1, 2})); //[1, 2]
    }
    public static int[] largerSumOfArray(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if(sumA > sumB || sumA == sumB){
            return a;
        }
        return b;
    }
}
