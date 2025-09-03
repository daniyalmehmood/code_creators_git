public class SingleCharSelector {
    public static String getCharFromEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        else
            return  str.substring(str.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(getCharFromEnd("Hello", true));
        System.out.println(getCharFromEnd("Hello", false) );
        System.out.println(getCharFromEnd("oh", true));
    }

    }