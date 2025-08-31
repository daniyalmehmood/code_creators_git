//Functional-1 > noX

import java.util.List;

public class XRemover {
    public List<String> removeAllX(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }
}