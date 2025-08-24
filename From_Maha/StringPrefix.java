public class StringPrefix {
    public static void main(String[] args) {
        StringPrefix obj = new StringPrefix();

        System.out.println(obj.getFirstTwoChars("Hello"));    // Output: He
        System.out.println(obj.getFirstTwoChars("abcdefg"));  // Output: ab
        System.out.println(obj.getFirstTwoChars("a"));        // Output: a
    }


    //Returns the first two characters of the input string.
   //If the string length is less than 2, returns the whole string.
     
    public String getFirstTwoChars(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }
}
