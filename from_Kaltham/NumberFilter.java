//Functional-2 > noNeg

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {

    public List < Integer > removeNegativeNumbers(List < Integer > nums) {
        List < Integer > result = nums.stream().filter(n->n >= 0).collect(Collectors.toList());

        return result;
    }

}