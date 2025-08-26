public class NoX {
  public List<String> noXInsideString(List<String> strings) {
        strings.replaceAll(n -> n.replace("x",""));
        return strings;

    }
}