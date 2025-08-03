public class LastTwoRepeater {


     // Takes the last 2 characters of a string and repeats them 3 times.

    public String repeatLastTwoChars(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public static void main(String[] args) {
        LastTwoRepeater obj = new LastTwoRepeater();

        System.out.println(obj.repeatLastTwoChars("Hello"));  // Output: lololo
        System.out.println(obj.repeatLastTwoChars("ab"));     // Output: ababab
        System.out.println(obj.repeatLastTwoChars("Hi"));     // Output: HiHiHi
    }
}
