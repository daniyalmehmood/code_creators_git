public class LeftTwo {
    public static void main(String[] args){
        System.out.println(left2("Hello")); //"lloHe"
        System.out.println(left2("java")); //"vaja"
        System.out.println(left2("Hi")); //"Hi"
    }
    public static String left2(String str) {
        String in0 = str.substring(0, 2);
        String news = str.substring(2);
        return news + in0;
    }
}
