public class CloseFar {
    public static boolean hasOneCloseOneFar(int a, int b, int c) {
        boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;
        boolean bFar = Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
        boolean cFar = Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
        return (cClose && bFar) || (bClose && cFar);
    }

    public static void main(String[] args){
        System.out.println(hasOneCloseOneFar(1, 2, 10));
        System.out.println(hasOneCloseOneFar(1, 2, 3));
        System.out.println(hasOneCloseOneFar(4, 1, 3));
    }
}
