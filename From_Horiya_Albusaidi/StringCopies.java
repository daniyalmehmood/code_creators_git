public class StringCopies {
    public boolean checkNumberOfSubCopiesOnString(String str, String sub, int n) {
        if (n == 0) return true;
        if (str.contains(sub)) {
            int indexOfSub = str.indexOf(sub);
            return checkNumberOfSubCopiesOnString(str.substring(indexOfSub + 1), sub, n = n - 1);

        } else return false;
    }

}
