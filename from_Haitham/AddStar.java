public class AddStar {
    public List<String> addStarBehindTheString(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
}