//Functional-1 > copies3


import java.util.List;
import java.util.stream.Collectors;

public class StringTripler {

    public List < String > tripleCopies(List < String > strings) {
        List < String > result = strings.stream().map(n->n + n + n).collect(Collectors.toList());

        return result;
    }

}