public class NumberDistanceChecker {
    public static boolean isCloseAndFar(int a, int b, int c) {
        boolean bClose = Math.abs(a-b)<=1 ; // is a-b 0 or 1
        boolean cClose = Math.abs(a-c)<=1; // is a-c 0 or 1
        boolean bFar =  Math.abs(a-b)>=2 && Math.abs(b-c)>=2; // is a-b at least 2 and b-c at least 2
        boolean cFar =  Math.abs(a-c)>=2 && Math.abs(c-b)>=2; // is a-c least 2 and b-c at least 2
        return (bClose && cFar) || (cClose && bFar); // return true if (a-b is 0 or 1 and a-c least 2 and b-c at least 2 )OR (a-c is 0 or 1 and a-cb least 2 and b-c at least 2 )
    }
    public static void main(String[] args) {
        System.out.println(isCloseAndFar(1,2,10));
    }
}
