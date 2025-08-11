public class WithoutTwo {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe")); //"lloHe"
        System.out.println(without2("HelloHi")); //"HelloHi"
        System.out.println(without2("Hi")); //""
    }
    public static String without2(String str) {
        if(str.length() == 2 || str.length() == 0){
            return "";
        }
        else if(str.length() == 1){
            return str;
        }
        else if(str.substring(0,2).equals(str.substring(str.length() -2))){
            return str.substring(2);
        }
        return str;
    }
}
