public class ZPatternCompressor {
    public static String removeMiddleFromZWords(String str) {
        StringBuilder result = new StringBuilder(); // initialize a string builder to store the result
        for (int i = 0; i < str.length(); i++) { //use a for loop to go through the 'str'
            if (i+2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') { // Check if the index value is 'z' and the value of index+2 is 'p'
                result.append("zp"); // add "zp" to the final result
                i += 2;// to skip 2 character from 'i'.
            }
            else {
                result.append(str.charAt(i)); // add the char is not 'z' to final 'result'
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeMiddleFromZWords("zipXzap"));
    }
}
