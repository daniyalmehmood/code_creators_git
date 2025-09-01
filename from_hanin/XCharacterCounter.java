public class XCharacterCounter {
    public static int countX(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            char leftChar = str.charAt(0);
            str = str.substring(1);
            if (leftChar == 'x') {
                return 1 + countX(str);
            } else {
                return 0 + countX(str);
            }

        }
    }
}

