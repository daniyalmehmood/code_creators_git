public class StringDoubleXChecker {
   public boolean checkDoubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'x') {
                if (str.charAt(i) == str.charAt(i + 1))
                    return true;
                else
                    return false;
            }


        }
        return false;
    }

}
