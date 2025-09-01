public class XYBalanceChecker {
    public boolean isXYBalanced(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');
        // no 'x'
        if (lastX == -1) {
            return true;
        }
        // balanced, last y comes after last x
        else if (lastY >= lastX) {
            return true;
        }
        // unbalanced, last y comes before last x
        else return false;
    }
}
