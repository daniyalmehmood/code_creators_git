public class PatternChecker {
    public static boolean containsBobPattern(String str) {
        for (int i=0 ; i<str.length() -2 ;i++){ // use a for loop to go through the str
            if (str.charAt(i)=='b' && str.charAt(i+2)=='b')return true; // return true while there is  "b-b" in the str
        }
        return false; // no "b-b" in the 'str'
    }
    public static void main(String[] args) {
        System.out.println(containsBobPattern("abcbob"));
    }
}
