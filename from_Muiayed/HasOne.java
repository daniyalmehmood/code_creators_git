public class HasOne {
    public static boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) return true;
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasOne(10));
        System.out.println(hasOne(22));
        System.out.println(hasOne(220));
    }
}