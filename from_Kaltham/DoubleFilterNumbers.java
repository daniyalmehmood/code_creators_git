//Functional-2 > two2

import java.util.List;
import java.util.stream.Collectors;

public class  DoubleFilterNumbers {

    public List < Integer > doubleAndRemoveEnding2(List < Integer > nums) {
        List < Integer > result = nums.stream().map(n->n * 2).filter(n->n % 10 != 2).collect(Collectors.toList());

        return result;
    }

}