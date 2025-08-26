public class WithouEndTwo {
    public static void main(String[] args) {
        System.out.println(withouEnd2("Hello")); //"ell"
        System.out.println(withouEnd2("abc"));//"b"
        System.out.println(withouEnd2("ab")); //""
    }
    public static String withouEnd2(String str) {
        if(str.length() < 2){
            return "";
        }
        String withOut = str.substring(1, str.length() - 1);
        return withOut;
    }
}
