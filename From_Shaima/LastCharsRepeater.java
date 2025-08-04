public class LastCharsRepeater {
    public static String repeatLastTwoCharsThreeTimes(String str) {
        String lastTwoChars =str.substring(str.length()-2,str.length()); //initialize 'lastTwoChars' variable and assign it to be the last two chars
        return lastTwoChars.repeat(3); //  repeat 'lastTwoChars' 3 times
    }
    public static void main(String[] args) {
        System.out.println(repeatLastTwoCharsThreeTimes("Hello"));
    }
}
