public class LessByTen {
    public static boolean isLessThanTen(int a, int b, int c) {
        return (a <= b - 10) || (a <= c - 10) ||
                (b <= a - 10) || (b <= c - 10) ||
                (c <= a - 10) || (c <= b - 10);
    }

public static void main (String[] args){
    System.out.println(isLessThanTen(1, 7, 11));
    System.out.println(isLessThanTen(1, 7, 10));
    System.out.println(isLessThanTen(11, 1, 7));
}

}
