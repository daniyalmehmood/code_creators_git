public class StringRepeater {

    // Returns a string made by repeating the last n characters of input n times
    public static String repeatLastNChars(String input, int n) {
        // Extract the last n characters
        String lastN = input.substring(input.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(repeatLastNChars("Hello", 3));
        System.out.println(repeatLastNChars("Hello", 2));
        System.out.println(repeatLastNChars("Hello", 1));
}