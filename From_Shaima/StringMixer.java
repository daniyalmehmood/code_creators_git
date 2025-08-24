public class StringMixer {
    public static String mixString(String a, String b) {
        int minLength = Math.min(a.length(), b.length()); //check which string is shortest and assign it to variable 'minLength'
        StringBuilder result=new StringBuilder(); // initialize the string builder to get the final result
        for (int i = 0; i<minLength; i++) { // use for loop to go through the strings
            result.append(a.charAt(i)); // add char from 'a' to 'result'
            result.append(b.charAt(i));// add char from 'b' to 'result'
                }
        if (b.length()>a.length()){ // if 'b' is longest
            result.append(b.substring(minLength,b.length())); // add all chars that are remain in 'b' to 'result'
        }
            result.append(a.substring(minLength,a.length()));// else 'a' is  the longest,  add all chars that are remain in 'a' to 'result'
       return result.toString(); // return the value of the 'result' after converted to string
    }
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("ab", "xyz"));
        System.out.println(mixString("abcde", "xyz"));
    }
}
