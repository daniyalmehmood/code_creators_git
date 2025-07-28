public class Left2 {
    public static String left2(String str) {
        String firstCh = "";
        String lastCh = "";
        if(str.length() > 2){
            firstCh = str.substring(0,2);
            lastCh = str.substring(2, str.length());
            return lastCh + firstCh;
        }
        else {
            return str;
        }
    }

    public static void main(String[] args){
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }
}
