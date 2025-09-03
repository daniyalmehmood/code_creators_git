public class StringEndingChecker {
    public static boolean doesOneStringEndWithTheOther(String first, String second) {
        // Convert both strings to lowercase to make the comparison case-insensitive
        String lowerFirst = first.toLowerCase();
        String lowerSecond = second.toLowerCase();
        // Check if first ends with second OR second ends with first
        return lowerFirst.endsWith(lowerSecond) || lowerSecond.endsWith(lowerFirst);
    }
    public static void main(String[] args) {
        System.out.println(doesOneStringEndWithTheOther("Hiabc", "abc"));    
        System.out.println(doesOneStringEndWithTheOther("AbC", "HiaBc"));   
        System.out.println(doesOneStringEndWithTheOther("abc", "abXabc"));  
    }
}