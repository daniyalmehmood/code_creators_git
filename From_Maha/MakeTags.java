public class HtmlTagBuilder {


    // Wraps a word with the given HTML tag.
  
    public String wrapWithTag(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args) {
        HtmlTagBuilder obj = new HtmlTagBuilder();

        System.out.println(obj.wrapWithTag("i", "Yay"));       // <i>Yay</i>
        System.out.println(obj.wrapWithTag("b", "Hello"));     // <b>Hello</b>
        System.out.println(obj.wrapWithTag("em", "Wow"));      // <em>Wow</em>
    }
}
