public class HtmlTagBuilder {
    public static String wrapWithHtmlTag(String tag, String word) {
        return "<" + tag +">" + word +"</" + tag + ">";
    }
    public static void main (String[] args) {
        System.out.println(wrapWithHtmlTag("i", "Yay"));
        System.out.println(wrapWithHtmlTag("i", "Hello"));
        System.out.println(wrapWithHtmlTag("cite", "Yay"));
    }
}