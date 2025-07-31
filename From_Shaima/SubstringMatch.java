public class SubstringMatch {
    public static int countMatchSubstring(String a, String b) {
        int count = 0;  // initialize  'count' variable
        int shortestLength = Math.min(a.length(), b.length()); // initialize 'shortestLength' variable and assign the length of shortest variable 'a' or 'b' by using Math.min()
        for (int i = 0; i < shortestLength-1; i++) // Use a for-loop to go through each character for the variable has the shortest length without the last character
        {
            if (a.substring(i, i+2).equals(b.substring(i, i+2))) //check if the substring of length 2 in both strings 'a' and 'b' is same
            {
                count++; // +1 to the count variable if the condition is true
            }
        }
        return count; // return the final number of 'count'
    }
    public static void main(String[] args) {
        System.out.println(countMatchSubstring("xxcaazz", "xxbaaz"));
        System.out.println(countMatchSubstring("abc", "abc"));
        System.out.println(countMatchSubstring("abc", "axc"));
        System.out.println(countMatchSubstring("hello", "he"));
        System.out.println(countMatchSubstring("h", "h"));
        System.out.println(countMatchSubstring("he", "hello"));
        System.out.println(countMatchSubstring("h", "hello"));
        System.out.println(countMatchSubstring("", "hello"));
        System.out.println(countMatchSubstring("aabbccdd", "abbbxxd"));
        System.out.println(countMatchSubstring("aaxxaaxx", "iaxxai"));
        System.out.println(countMatchSubstring("iaxxai", "aaxxaaxx"));
    }
}
