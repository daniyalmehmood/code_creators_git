public class Without2 {

        public static String without2(String str) {
            int len = str.length();
            if (len >= 2 && str.substring(0, 2).equals(str.substring(len - 2))) {
                return str.substring(2);
            }
            return str;
        }

        public static void main(String[] args) {
            System.out.println(without2("HelloHe"));
            System.out.println(without2("HelloHi"));
            System.out.println(without2("Hi"));
        }
    }
