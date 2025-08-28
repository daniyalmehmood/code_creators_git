//Functional-2 > noLong

import java.util.List;
import java.util.stream.Collectors;


public class ShortStringsFilter {

    public List < String > filterShort(List < String > strings) {
        List < String > result = strings.stream().filter(n->n.length() < 4).collect(Collectors.toList());

        return result;
    }

}