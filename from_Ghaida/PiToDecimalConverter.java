public class PiToDecimalConverter {//Recursion-1 > changePi
    public static void main(String[] args) {
        System.out.println(convertPiToDecimal("xpix"));// → "x3.14x"
        System.out.println(convertPiToDecimal("pipi"));// → "3.143.14"
        System.out.println(convertPiToDecimal("pip"));// → "3.14p"
    }
    public static String convertPiToDecimal(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0,2).equals("pi")) {
            return "3.14" + convertPiToDecimal(str.substring(2));
        }
        return str.charAt(0) + convertPiToDecimal(str.substring(1));
    }
}