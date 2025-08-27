//Recursion-1 > changePi

public class PiReplacer {
    public String convertPiToDicmalValue(String str) {

        if (str.length() < 2) {
            return str;
        }

        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + convertPiToDicmalValue(str.substring(2));
        }

        return String.valueOf(str.charAt(0)) + convertPiToDicmalValue(str.substring(1));
    }
}