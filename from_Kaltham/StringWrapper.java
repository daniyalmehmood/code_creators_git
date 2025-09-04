//Functional-1 > moreY

import java.util.List;
import java.util.stream.Collectors;

public class StringWrapper {

    public List < String > wrapWithY(List < String > strings) {
        List < String > result = strings.stream().map(n->"y" + n + "y").collect(Collectors.toList());

        return result;
    }

}