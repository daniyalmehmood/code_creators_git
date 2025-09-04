//Recursion-1 > endX

public class XMover {
    public String moveXToEnd(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == ('x')) {
            return moveXToEnd(str.substring(1)) + str.charAt(0);
        }

        return str.charAt(0) + moveXToEnd(str.substring(1));
    }
}