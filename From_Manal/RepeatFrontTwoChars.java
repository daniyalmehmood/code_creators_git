public class RepeatFrontTwoChars {
    //function that returns three copies of the first two characters
    public static String repeatFirstTwoThreeTimes(String str) {
        String front;
        if (str.length() > 2) {
            front = str.substring(0, 2);
        }
        else {
            front = str;
        }
        return front + front + front;
    }
    public static void main(String[] args) {
        System.out.println(repeatFirstTwoThreeTimes("Hello"));
        System.out.println(repeatFirstTwoThreeTimes("ab"));
        System.out.println(repeatFirstTwoThreeTimes("H") );
    }

}
 
    