//Functional-1 > copies3

import java.util.List;

public class ThreeCopies {
    public List<String> repeatEachStringThreeTimes(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

}