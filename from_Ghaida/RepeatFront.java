public class RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4)); //"ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3)); //"ChoChC"
        System.out.println(repeatFront("Ice Cream", 2)); //"IcI"
    }
    public static String repeatFront(String str, int n) {
        StringBuilder newString = new StringBuilder();
        if(str != "") {
            for (int i = n; i > 0; i--) {
                newString.append(str.substring(0, i));
            }
            return newString.toString();
        }
        return "";
    }
}
