// String-3 > notReplace
public class WordReplace {
    public static String replaceWithIsNot(String str) {
        return str.replaceAll("\\bis\\b", "is not");
    }

    public static void main(String[]args){
        System.out.println(replaceWithIsNot("is test"));
        System.out.println(replaceWithIsNot("is-is"));
        System.out.println(replaceWithIsNot("This is right"));
    }
}
