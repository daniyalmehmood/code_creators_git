public class ExtraFront {
    public static String extraFront(String str) {
        if(str.length() >= 2){
            String newStr = str.substring(0,2);
            return newStr + newStr + newStr;
        }
        else {
            return str + str + str;
        }
    }

    public static void main(String[] args){
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }
}
