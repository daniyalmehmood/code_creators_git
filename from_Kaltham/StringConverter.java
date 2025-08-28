//Functional-1 > lower


import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {

    public List < String > stringToLowerCase(List < String > strings) {
        List < String > result = strings.stream().map(n->n.toLowerCase()).collect(Collectors.toList());

        return result;
    }

}