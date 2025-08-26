public class StringConcatenator {
    public static void main(String[] args) {
        System.out.println(concatenateWithOverlap("abc", "cat")); //"abcat"
        System.out.println(concatenateWithOverlap("dog", "cat")); //"dogcat"
        System.out.println(concatenateWithOverlap("abc", "")); //"abc"
    }
    public static String concatenateWithOverlap(String a, String b) {
        if(a.isEmpty() || b.isEmpty()){
            return a + b;
        }
        else if(a.charAt(a.length() -1) == b.charAt(0)){
            return a + b.substring(1);
        }
        return a + b;
    }
}
