public class ExtraEnd {
    public static String extraEnd(String str) {
       String newStr = str.substring(str.length()-2);
        return newStr + newStr + newStr;
    }

    public static void main(String[] args){
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }
}
