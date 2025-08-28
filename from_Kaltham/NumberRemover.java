//Functional-2 > no9


import java.util.List;
import java.util.stream.Collectors;

public class NumberRemover {

    public List < Integer > removeEndingWith9(List < Integer > nums) {
        List < Integer > result = nums.stream().filter(n->n % 10 != 9).collect(Collectors.toList());

        return result;
    }

}