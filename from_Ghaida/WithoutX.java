public class WithoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix")); //"Hi"
        System.out.println(withoutX("xHi")); //"Hi"
        System.out.println(withoutX("Hxix")); //"Hxi"
    }
    public static String withoutX(String str) {
        if(str == ""){
            return "";
        }
        if(str.charAt(0) == 'x'){
            str =  str.substring(1);
        }
        if(str.length() > 0 && str.charAt(str.length() - 1) == 'x'){
            str =  str.substring(0, str.length() - 1);
        }
        return str;
    }
}
