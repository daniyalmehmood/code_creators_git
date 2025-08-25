//Recursion-1 > changePi
public class PiReplacer {
    public static String replacePiWith314(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String firstTwo = str.substring(0, 2);
            if (firstTwo.equals("pi")) {
                return 3.14 + replacePiWith314(str.substring(2));
            } else {
                return str.charAt(0) + replacePiWith314(str.substring(1));
            }
        }
    }

}

