public class ABCSubstringCounter {
    public int countAbcAndAba(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            String first = str.substring(0, 3);
            if (first.equals("abc") || first.equals("aba")) {
                return 1 + countAbcAndAba(str.substring(1));
            } else {
                return 0 + countAbcAndAba(str.substring(1));
            }
        }
    }

}

