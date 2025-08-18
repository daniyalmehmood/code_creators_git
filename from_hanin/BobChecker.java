public class BobChecker {
    public  static boolean hisBob(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            // Check if char at i and i+2 are 'b'
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }


}
