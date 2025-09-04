public class WithoutXTwo {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi")); //"Hi"
        System.out.println(withoutX2("Hxi")); //"Hi"
        System.out.println(withoutX2("xxHi")); //"Hi"
    }
    public static String withoutX2(String str) {
        StringBuilder newString = new StringBuilder();
        if(str == ""){
            return str;
        }
        if(str.charAt(0) != 'x'){
            newString.append(str.charAt(0));
        }
        if(str.length() > 1 && str.charAt(1) != 'x'){
            newString.append(str.charAt(1));
        }
        if(str.length() > 2){
            newString.append(str.substring(2));
        }
        return newString.toString();
    }
}
