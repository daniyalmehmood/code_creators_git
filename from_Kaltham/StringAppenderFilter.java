//Functional-2 > noYY


import java.util.List;
import java.util.stream.Collectors;


public class StringAppenderFilter {

    public List < String > appendYWithoutDoubleY(List < String > strings) {
        List < String > result = strings.stream().map(n->n + "y").filter(n->!n.contains("yy")).collect(Collectors.toList());

        return result;
    }

}