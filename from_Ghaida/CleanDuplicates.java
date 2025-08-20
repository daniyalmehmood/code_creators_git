public class CleanDuplicates {//Recursion-1 > cleanRepeatedChars
    public static void main(String[] args) {
        System.out.println(cleanRepeatedChars("yyzzza")); // "yza"
        System.out.println(cleanRepeatedChars("abbbcdd")); // "abcd"
        System.out.println(cleanRepeatedChars("Hello")); // "Helo"
    }

    public static String cleanRepeatedChars(String str) {
        if(str.length() <= 1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return cleanRepeatedChars(str.substring(1));
        }
        return str.charAt(0) + cleanRepeatedChars(str.substring(1));
    }
}