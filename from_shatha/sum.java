public class sum {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));  
        System.out.println(sum(3, 2));  
        System.out.println(sum(2, 2));  
    }

    public static double sum(double a, double b) {
        if (a != b) {
            return a + b;
        } else {
            return 2 * (a + b);
        }
    }
}
