public class WithoutX2 {

        public static String withoutX2(String str) {
            int len = str.length();
            if (len == 0) return str;

            StringBuilder sb = new StringBuilder();

            if (len >= 1 && str.charAt(0) != 'x') sb.append(str.charAt(0));
            if (len >= 2 && str.charAt(1) != 'x') sb.append(str.charAt(1));
            if (len > 2) sb.append(str.substring(2));

            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println(withoutX2("xHi"));
            System.out.println(withoutX2("Hxi"));
            System.out.println(withoutX2("Hi"));
            System.out.println(withoutX2("xx"));
            System.out.println(withoutX2("ax"));  
        }
    }
