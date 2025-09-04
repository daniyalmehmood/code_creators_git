//Functional-1 > square

import java.util.List;
import java.util.stream.Collectors;

public class NumberSquarer {

    public List < Integer > squareValues(List < Integer > nums) {
        List < Integer > result = nums.stream().map(n->n * n).collect(Collectors.toList());

        return result;
    }

}