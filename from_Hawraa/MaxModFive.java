public class MaxModFive {
    public static int maxUnlessSameModFive(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        else {
            return Math.max(a, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(maxUnlessSameModFive(2, 3));
        System.out.println(maxUnlessSameModFive(6, 2));
        System.out.println(maxUnlessSameModFive(3, 2));
    }
}
