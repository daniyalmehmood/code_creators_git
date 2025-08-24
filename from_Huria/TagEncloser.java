public class TagEncloser {
    public static String tagEncloser(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public static void main(String[] args) {

        System.out.println(TagEncloser.tagEncloser("i", "Yay"));
        System.out.println(TagEncloser.tagEncloser("i", "Hello"));
        System.out.println(TagEncloser.tagEncloser("cite", "Yay"));
        System.out.println(TagEncloser.tagEncloser("address", "here"));
        System.out.println(TagEncloser.tagEncloser("body", "Heart"));
        System.out.println(TagEncloser.tagEncloser("i", "i"));
        System.out.println(TagEncloser.tagEncloser("i", ""));
    }
}