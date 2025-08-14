public class TwoAsOne {
    public static boolean isSumOfTwoEqualThird(int a, int b, int c) {
        return a + b == c || a + c == b || c + b == a;
    }
 public static void main(String[] args){
     System.out.println(isSumOfTwoEqualThird(1, 2, 3));
     System.out.println(isSumOfTwoEqualThird(3, 1, 2));
     System.out.println(isSumOfTwoEqualThird(3, 2, 2));
 }
}
