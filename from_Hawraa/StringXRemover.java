// Recursion-1 > noX
public class StringXRemover {
    public String removeXChars(String str) {
        if (str.isEmpty()) return "";
        if (str.charAt(0) == 'x') {
            return removeXChars(str.substring(1));
        }
        return str.charAt(0) + removeXChars(str.substring(1));
    }
}