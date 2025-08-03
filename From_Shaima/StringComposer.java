public class StringComposer{
    public static String comboString(String a, String b) {
        int aLength = a.length(); //initialize 'alength' variable to calculate the length of 'a'
        int bLength = b.length(); //initialize 'blength' variable to calculate the length of 'b'
        if (aLength < bLength) //check which one is longer
        {
            return a + b + a; // return 'a + b + a' because 'b' string is longest
        }
        else {
            return b + a + b; // return 'b + a + b' because 'a' string is longest
        }
    }
    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
    }
}
