public class UniqueSumCalculator {
    public static int sumOfUniqueValues(int a, int b, int c) {
        if (a==b && b==c) return 0; // while are variable are equal to each other , return 0
        if (a==b) return c;
        if (a==c) return b;
        if (b==c) return a;
        return a+b+c ; // while all are different from each other return the sum of them
    }
    public static void main(String[] args) {
        System.out.println(sumOfUniqueValues(1, 2, 3));
    }
}
