public class lastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars")); //"ls"
        System.out.println(lastChars("yo", "java")); //"ya"
        System.out.println(lastChars("hi", "")); //"h@"
    }
    public static String lastChars(String a, String b) {
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
