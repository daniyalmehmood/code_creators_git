public class WithouEnd2 {
    public static String withouEnd2(String str) {
        if (str.length() > 1){
            return str.substring(1, str.length() - 1);
        }
        else {
            return str = "";
        }
    }

    public static void main(String[] args){
        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
    }
}
