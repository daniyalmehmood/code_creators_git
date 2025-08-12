public class RightTwo {
    public static String right2(String str) {
        if(str.length() > 2){
            String firstCh = str.substring(str.length() - 2, str.length());
            String lastCh = str.substring(0, str.length() -2);
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
