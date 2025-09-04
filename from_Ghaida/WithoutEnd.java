public class WithoutEnd {
    public static void main(String[] args){
        System.out.println(withoutEnd("Hello")); //"ell"
        System.out.println(withoutEnd("java")); //"av"
        System.out.println(withoutEnd("coding")); //"odin""
    }
    public static String withoutEnd(String str) {
        String withOut = str.substring(1, str.length() - 1);
        return withOut;
    }
}
