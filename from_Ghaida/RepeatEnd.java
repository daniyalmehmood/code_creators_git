public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3)); //"llollollo"
        System.out.println(repeatEnd("Hello", 2)); //"lolo"
        System.out.println(repeatEnd("Hello", 1)); //"o"
    }
    public static String repeatEnd(String str, int n) {
        StringBuilder newString = new StringBuilder();
        if(str != "") {
            if (n == 0) {
                return "";
            }
            if (n <= 1) {
                return str.substring(str.length() - 1);
            }
            for (int i = 0; i < n; i++) {
                newString.append(str.substring(str.length() - n));
            }
            return newString.toString();
        }
        return "";
    }
}
/*public static String RepeatEnd(String str, int n) {
        if(n <= 1){
            return str.substring(str.length()-1);
        }
        for (int i = 0; i < str.length(); i++) {
            String lastEnd = str.substring(str.length() - n);
            return lastEnd.repeat(n);
        }
        return str;
    }*/