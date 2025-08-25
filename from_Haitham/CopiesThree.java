public class CopiesThree {
    public List<String> replaceElementWithThreeCopies(List<String> strings) {
        strings.replaceAll(n -> n + n+n);
        return strings;

    }
}