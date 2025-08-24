public class doubleChar {
        public String doubleChar(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                sb.append(c).append(c);
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            doubleChar dc = new doubleChar();
            System.out.println(dc.doubleChar("The"));
            System.out.println(dc.doubleChar("AAbb"));
            System.out.println(dc.doubleChar("Hi-There"));
        }
    }

