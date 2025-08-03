public class without2 {
    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String first = str.substring(0, 2);
        String last = str.substring(str.length() - 2);
        if (first.equals(last)){
            return str.length() == 2 ? "" : str.substring(2);
        } else {
            return str;
        }
    }
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }

}
