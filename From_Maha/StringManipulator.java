public class StringManipulator {
    public String swapLastTwoCharacters(String str) {
        if (str.length() >= 2) {
            String lastChar = str.substring(str.length() - 1);
            String secondLastChar = str.substring(str.length() - 2, str.length() - 1);
            String remaining = str.substring(0, str.length() - 2);
            return remaining + lastChar + secondLastChar;
        }
        return str;
    }
}
