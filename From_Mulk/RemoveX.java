//Functional-1 > noX

public class RemoveX {
    public List<String> removeAllXCharacters(List<String> strings) {
        strings.replaceAll(s -> s.replaceAll("x", ""));
        return strings;
    }
}