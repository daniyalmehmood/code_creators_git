public class FirstLastCharExtractor {
    public static void main(String[] args) {
        System.out.println(getFirstAndLastChars("last", "chars")); //"ls"
        System.out.println(getFirstAndLastChars("yo", "java")); //"ya"
        System.out.println(getFirstAndLastChars("hi", "")); //"h@"
    }
    public static String getFirstAndLastChars(String a, String b) {
        if(a.isEmpty() && b.isEmpty()){
            return "@" +  "@";
        }
        else if (b.isEmpty()) {
            return a.charAt(0) + "@";
        }
        else if (a.isEmpty()) {
            return "@" + b.charAt(b.length() - 1);
        }
        return a.charAt(0) + "" +  b.charAt(b.length() - 1);
    }
}
