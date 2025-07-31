public class max1020 {
    public static int max1020(int a, int b) {
        boolean rangeA = (a >= 10 && a <= 20);
        boolean rangeB = (b >= 10 && b <= 20);

        if (rangeA && rangeB) {
            return Math.max(a, b);
        } else if (rangeA) {
            return a;
        } else if (rangeB) {
            return b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(max1020(11, 19)); 
        System.out.println(max1020(19, 11)); 
        System.out.println(max1020(11, 9));  

    }
}
