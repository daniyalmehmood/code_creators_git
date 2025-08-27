//Recursion-1 > countAbc

public class SubstringCounter {
    public int countPatterns(String str) {
        if (str.length() <= 2) {
            return 0;
        }

        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {

            return 1 + countPatterns(str.substring(1));
        }

        return countPatterns(str.substring(1));

    }
}