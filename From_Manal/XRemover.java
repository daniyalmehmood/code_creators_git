public class XRemover {
    public static String removeEdgeXCharacter(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.startsWith("x")) str = str.substring(1, str.length());
        if (str.endsWith("x") && str.length() > 0) str = str.substring(0, str.length() - 1);
        return str;
    }
    public static void main(String[] args) {
        System.out.println(removeEdgeXCharacter("xHix"));
        System.out.println(removeEdgeXCharacter("xHi"));
        System.out.println(removeEdgeXCharacter("Hxix") );
    }

}