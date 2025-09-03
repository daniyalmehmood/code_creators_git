public class CloseFar {

    public boolean closeFar(int a, int b, int c) {
        boolean bClose = Math.abs(b - a) <= 1;
        boolean cClose = Math.abs(c - a) <= 1;

        boolean bFarFromC = Math.abs(b - c) >= 2;
        boolean cFarFromB = Math.abs(c - b) >= 2;

        // Check if one of b or c is close to a, and the other is far from both a and the close one
        if (bClose && !cClose && Math.abs(c - a) >= 2 && bFarFromC) {
            return true;
        }
        if (cClose && !bClose && Math.abs(b - a) >= 2 && cFarFromB) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        CloseFar cf = new CloseFar();
        System.out.println(cf.closeFar(1, 2, 10));
        System.out.println(cf.closeFar(1, 2, 3));
        System.out.println(cf.closeFar(4, 1, 3));
    }
}