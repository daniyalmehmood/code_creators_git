public class NumberSpacingChecker {
    public static boolean areEvenlySpaced(int a, int b, int c) {
        int max=Math.max(a,Math.max(b,c)); // get which biggest value
        int min=Math.min(a,Math.min(b,c)); // get which smallest value
        int middle=a+b+c-max-min; // get the middle value
        return middle-min == max-middle; // return true while difference between small and middle == middle and big
    }
    public static void main(String[] args) {
        System.out.println(areEvenlySpaced(2, 4, 6));
    }
}
