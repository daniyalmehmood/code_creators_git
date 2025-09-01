public class StringRepeater {
    public static String repeatEnd(String str, int n) {
        String lastPart = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastPart);
        }

        return result.toString();
    }
        public static void main (String[]args){
            System.out.println(repeatEnd("Hello", 3) );
            System.out.println(repeatEnd("Hello", 2));
            System.out.println(repeatEnd("Hello", 1));
        }

}
