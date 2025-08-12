public class AtFirst {
    public static String getFirstTwoWithPadding(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        else if(str.length()==1){
            return str+"@";

        }else{
            return "@@";
        }
    }
    public static void main(String[] args) {
        System.out.println(getFirstTwoWithPadding("hello"));
        System.out.println(getFirstTwoWithPadding("hi"));
        System.out.println(getFirstTwoWithPadding("h"));
    }
}
