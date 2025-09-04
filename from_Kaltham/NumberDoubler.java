//Functional-1 > doubling

import java.util.List;
import java.util.stream.Collectors;


public class NumberDoubler {

    public List<Integer> doubleValues(List<Integer> nums) {
        List<Integer> result= nums.stream().map(n-> n*2).collect(Collectors.toList());

        return result;
    }

}
