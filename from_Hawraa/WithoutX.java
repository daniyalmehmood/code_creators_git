public class WithoutX {
    public static String withoutX(String str) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        if (len > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
            len--;
        }
        if (len > 0 && str.charAt(len - 1) == 'x') {
            str = str.substring(0, len -1);
        }
        return str;
    }

    public static void main(String[] args){
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }
}
