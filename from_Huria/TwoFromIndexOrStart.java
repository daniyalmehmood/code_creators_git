public class TwoFromIndexOrStart {
    public static String twoFromIndexOrStart(String str, int index) {
        if (index >= str.length() - 1 || index < 0) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public static void main(String[] args) {

        System.out.println(twoFromIndexOrStart("java", 0));
        System.out.println(twoFromIndexOrStart("java", 2));
        System.out.println(twoFromIndexOrStart("Hello", -7));
        System.out.println(twoFromIndexOrStart("Hello", -1));
        System.out.println(twoFromIndexOrStart("Hello", 6));
        System.out.println(twoFromIndexOrStart("Hello", 1));
        System.out.println(twoFromIndexOrStart("yay", 0));
    }
}