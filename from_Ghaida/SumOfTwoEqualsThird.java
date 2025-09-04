public class SumOfTwoEqualsThird {
    public static void main(String[] args) {
        System.out.println(isSumOfTwoEqualsThird(1, 2, 3));// → true
        System.out.println(isSumOfTwoEqualsThird(3, 1, 2));// → true
        System.out.println(isSumOfTwoEqualsThird(3, 2, 2));// → false
    }
    public static boolean isSumOfTwoEqualsThird(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }
}
