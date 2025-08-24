public class ExtractFirstTwoChar {
    public static String firstTwoCharsExtractor(String str) {
        if (str.length()>=2) // check the length of the input
        {
            String firstTwoChar=str.substring(0,2); // initialize 'firstTwoChar' variable and assign it to be the first two chars
            return firstTwoChar;
        }
        else {
            return str; // return str while the str length is less than or equal 2
        }
    }
    public static void main(String[] args) {
        System.out.println(firstTwoCharsExtractor("Hello"));
        System.out.println(firstTwoCharsExtractor("abcdefg"));
    }
}
