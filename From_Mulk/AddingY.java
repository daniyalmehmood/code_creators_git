//Functional-1 > moreY

import java.util.List;

public class AddingY {
    public List<String> addYToFrontAndBack(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

}