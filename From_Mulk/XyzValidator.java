public class XyzValidator {
    public boolean endSubstringComparator(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 3 && str.substring(i, i + 4).equals(".xyz")) {
                i += 3;
                continue;
            }
            if (i < str.length() - 2 && str.substring(i, i + 3).equals("xyz")) {

                return true;
            }
        }
        return false;
    }
}


