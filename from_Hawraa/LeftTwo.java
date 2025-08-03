public class LeftTwo {
    public static String leftTwo(String str) {
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
        System.out.println(leftTwo("Hello"));
        System.out.println(leftTwo("java"));
        System.out.println(leftTwo("Hi"));
    }
}
