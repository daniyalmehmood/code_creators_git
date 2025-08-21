public class HTMLBuilder {
    public static String generateHTMLTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">"; // return the html format 
    }
    public static void main(String[] args) {
        System.out.println(generateHTMLTags("i", "Yay"));
        System.out.println(generateHTMLTags("i", "Hello"));
        System.out.println(generateHTMLTags("cite", "Yay"));
    }
}
