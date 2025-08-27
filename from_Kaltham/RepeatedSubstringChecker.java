//Recursion-1 > strCopies

//Recursion-1 > strCopies


public class RepeatedSubstringChecker {
    public boolean hasAtLeastNCopies(String str, String sub, int n) {
        int lengthOfSub = sub.length();

        if (n <= 0) {
            return true;
        }

        if (str.length() < lengthOfSub) {
            return false;
        }

        if (str.substring(0, lengthOfSub).equals(sub)) {
            return hasAtLeastNCopies(str.substring(1), sub, n - 1);
        } else {
            return hasAtLeastNCopies(str.substring(1), sub, n);
        }

    }

}