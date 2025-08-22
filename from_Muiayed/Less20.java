public class Less20 {

    public static boolean less20(int n) {
        int r = n % 20;
        return r == 18 || r == 19;
    }

    public static void main(String[] args) {
        System.out.println(less20(18)); // true
        System.out.println(less20(19)); // true
        System.out.println(less20(20)); // false
    }
}