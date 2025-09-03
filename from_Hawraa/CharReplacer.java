// Recursion-1 > changeXY
public class CharReplacer {
    public String changeXWithY(String str) {
        if (str.isEmpty()) return "";

        if (str.charAt(0) == 'x') {
            return "y" + changeXWithY(str.substring(1));
        }
        return str.charAt(0) + changeXWithY(str.substring(1));
    }
}