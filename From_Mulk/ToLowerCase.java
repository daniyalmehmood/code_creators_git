//Functional-1 > lower

public class ToLowerCase {
    public List<String> toLowerCaseAll(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }
}