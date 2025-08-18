public class TeenSum {
    public static int calculateTeenSum(int a, int b) {
        if ((a>=13 && a<= 19)||(b>=13 && b<= 19)) {
            return 19;
        } else {
            return (a + b);
        }
    }
        public static void main (String[] args){
            System.out.println(calculateTeenSum(3,4));
            System.out.println(calculateTeenSum(10,13));
            System.out.println(calculateTeenSum(13,2));
        }
}
