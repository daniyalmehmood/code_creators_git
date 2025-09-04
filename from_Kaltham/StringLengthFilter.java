//Functional-2 > no34

import java.util.List;
import java.util.stream.Collectors;

public class StringLengthFilter {

    public List < String > filterNotThreeOrFour(List < String > strings) {
        List < String > result = strings.stream().filter(n->n.length() != 3 && n.length() != 4).collect(Collectors.toList());

        return result;
    }

}