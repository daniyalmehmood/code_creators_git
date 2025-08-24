public class MiddleSubstring {
   //Returns a substring of length 3 centered in the middle of the input string.
    public String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }
}
