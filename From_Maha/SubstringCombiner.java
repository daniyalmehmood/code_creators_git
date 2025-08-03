public class SubstringCombiner  {
     // Returns a new string made of the first n and last n characters of the input string.
     //If the string length is less than n, returns the original string.
    public String getNTwice(String str, int n) {
        if (str.length() >= n) {
            return str.substring(0, n) + str.substring(str.length() - n);
        }
        return str;
    }
}
