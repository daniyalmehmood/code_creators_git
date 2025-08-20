public class TwoAsOne {
    public static boolean isSumOfTwo(int a, int b, int c) {
  return (a+b==c) || (a+c==b) || (b+c==a);
    }
    public static void main (String[] args){
        System.out.println(isSumOfTwo(1,2,3));
        System.out.println(isSumOfTwo(3,1,2));
        System.out.println(isSumOfTwo(3,2,2));
    }
}
