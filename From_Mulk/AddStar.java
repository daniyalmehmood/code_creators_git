//Functional-1 > addStar

import java.util.List;

public class AddStar {
    public List<String> appendStarToEachString(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

}