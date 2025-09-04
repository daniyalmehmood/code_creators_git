public class NonStart {
    public static void main(String[] args){
        System.out.println(nonStart("Hello", "There")); //"ellohere"
        System.out.println(nonStart("java", "code")); //"avaode"
        System.out.println(nonStart("shotl", "java")); //"hotlava"
    }
    public static String nonStart(String a, String b) {
        a = a.substring(1, a.length());
        b = b.substring(1, b.length());
        return a + b;
    }
}
