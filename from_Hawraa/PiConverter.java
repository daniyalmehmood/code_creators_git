// Recursion-1 > changePi
public class PiConverter {
    public String convertPiToDecimal(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + convertPiToDecimal(str.substring(2));
        }
        return str.charAt(0) + convertPiToDecimal(str.substring(1));
    }
}