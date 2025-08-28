//Functional-1 > rightDigit

import java.util.List;
import java.util.stream.Collectors;

public class GetRigthDigit {

    public List < Integer > extractLastDigit(List < Integer > nums) {
        List < Integer > result = nums.stream().map(n->n % 10).collect(Collectors.toList());

        return result;
    }

}