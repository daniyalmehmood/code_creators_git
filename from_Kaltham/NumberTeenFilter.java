//Functional-2 > noTeen

import java.util.List;
import java.util.stream.Collectors;


public class NumberTeenFilter {

    public List < Integer > removeTeens(List < Integer > nums) {
        List < Integer > result = nums.stream().filter(n->n < 13 || n > 19).collect(Collectors.toList());

        return result;
    }

}