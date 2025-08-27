//Logic-2 > closeFar


public class CloseFarChecker {
    public boolean isCloseFar(int a, int b, int c) {

        if (Math.abs(b - a) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        if (Math.abs(c - a) <= 1 && Math.abs(b - a) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        return false;
    }
}