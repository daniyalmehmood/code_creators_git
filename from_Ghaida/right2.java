public class right2 {
    public static void main(String[] args){
        System.out.println(right2("Hello"));//"loHel"
        System.out.println(right2("java")); //"vaja"
        System.out.println(right2("Hi")); //"Hi"
    }
    public static String right2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String last2 = str.substring(str.length() - 2);
        String restOfString = str.substring(0, str.length() - 2);
        return last2 + restOfString;
    }
}
