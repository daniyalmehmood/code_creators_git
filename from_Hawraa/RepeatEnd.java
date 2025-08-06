public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        StringBuilder result = new StringBuilder();
        String repeatPart = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            result.append(repeatPart);
        }
        return result.toString();
    }
    public static void main(String[] args){
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}
