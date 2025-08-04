public class DoubleX {
    public boolean hasDoubleX(String str) {
        int postionOfX = str.indexOf('x');
        if (postionOfX == -1 || postionOfX + 1 >= str.length()) {
            return false;
        }
        return str.charAt(postionOfX + 1) == 'x';
    }
}