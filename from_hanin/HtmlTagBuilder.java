// Class to build an HTML element using a tag and a word
public class HtmlTagBuilder {

    // Method that returns a word wrapped in an HTML tag
    public String formatHtml(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
