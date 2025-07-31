public class MakeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay")); //"<i>Yay</i>"
        System.out.println(makeTags("i", "Hello")); //"<i>Hello</i>"
        System.out.println(makeTags("cite", "Yay")); //"<cite>Yay</cite>"
    }
    public static String makeTags(String tag, String word) {
        return "<" +tag + ">" + word + "</" +tag + ">";
    }
}
