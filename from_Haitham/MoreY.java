public class MoreY {
    public List<String> AddingY(List<String> strings) {
        strings.replaceAll(n -> "y" + n+"y");
        return strings;


    }
}