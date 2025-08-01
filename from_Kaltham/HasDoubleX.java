public class HasDoubleX {
    public boolean hasDoubleX(String str) {
        int postionOfx = str.indexOf('x');
        if (postionOfx == -1 || postionOfx + 1 >= str.length()) {
            return false;
        }
        return str.charAt(postionOfx + 1) == 'x';
    }
}