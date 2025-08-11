public class DoubleXChecker {

    //Checks if the first 'x' in the string is immediately followed by another 'x'.

    public boolean checkDoubleX(String str) {
        int xIndex = str.indexOf('x');
        if (xIndex == -1 || xIndex + 1 >= str.length()) {
            return false; // No 'x' found or no character after 'x'
        }
        return str.charAt(xIndex + 1) == 'x'; // Check if next char is 'x'
    }
}
