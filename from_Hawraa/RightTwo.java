public class RightTwo {
    public static String right2(String str) {
        String firstCh = "";
        String lastCh = "";
        if(str.length() > 2){
            firstCh = str.substring(str.length() - 2, str.length());
            lastCh = str.substring(0, str.length() -2);
            return firstCh + lastCh;
        }
        else {
            return str;
        }
    }

    public static void main(String[] args){
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }
}
