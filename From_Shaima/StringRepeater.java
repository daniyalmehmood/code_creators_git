public class StringRepeater {
    public static String repeateString(String str, int n) {
        StringBuilder result = new StringBuilder();  // Create a StringBuilder object to build the final result
        for (int i = 0; i < n; i++) // Use a for-loop to add 'str' as per 'n' times .
        {
            result.append(str); // add the 'str' string after repeated it as value of 'n' to the builder 'result'
        }
        return result.toString(); // return the final output after converting the StringBuilder to String
    }
    public static void main(String[] args) {
        System.out.println(repeateString("Hi", 2));
        System.out.println(repeateString("Hi", 3));
        System.out.println(repeateString("Hi", 1));
    }
}
