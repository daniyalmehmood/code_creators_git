//Recursion-1 > changeXY


public class CharacterReplacer {
    public String replaceXWithY(String str) {
        if (str.length() == 0) {
            return "";
        }
        char firstChar = str.charAt(0);

        if (firstChar == 'x') {
            firstChar = 'y';
        }

        return String.valueOf(firstChar) + replaceXWithY(str.substring(1));
    }
}