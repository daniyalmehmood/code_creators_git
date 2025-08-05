public class StringE {
    public static boolean stringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') counter++;

        }
        if (counter > 3 || counter == 0) {
            return false;
        } else return true;

    }
}
