public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("The")); //"TThhee"
        System.out.println(doubleChar("AAbb")); //"AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); //"HHii--TThheerree"
    }
    public static String doubleChar(String str) {
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newS.append(str.charAt(i));
            newS.append(str.charAt(i));
        }
        return newS.toString();
    }
}
