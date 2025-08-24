public class NotReplace {
    public String replaceIsWithIsNot(String str) {

        return str.replaceAll("\\bis\\b", "is not");
    }
}
