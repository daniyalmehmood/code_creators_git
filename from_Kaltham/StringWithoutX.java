//Functional-1 > noX


import java.util.List;
import java.util.stream.Collectors;

public class StringWithoutX {

    public List < String > removeXFromString(List < String > strings) {
        List < String > result = strings.stream().map(n->n.replace("x", "")).collect(Collectors.toList());

        return result;
    }

}