public class TheEnd {
    public static void main(String[] args){
        System.out.println(theEnd("Hello", true)); // → "H"
        System.out.println(theEnd("Hello", false)); // → "o"
        System.out.println(theEnd("oh", true)); // → "o"
    }
    public static String theEnd(String str, boolean front) {
        if(front){
            str = str.substring(0, 1);
            return str;
        }
        else{
            str = str.substring(str.length() - 1);
            return str;
        }
    }
}
