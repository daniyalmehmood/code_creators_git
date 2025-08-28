//Functional-1 > math1


import java.util.List;
import java.util.stream.Collectors;

public class NumberTransformer {

    public List < Integer > incrementAndMultiplyBy10(List < Integer > nums) {
        List < Integer > result = nums.stream().map(n->(n + 1) * 10).collect(Collectors.toList());

        return result;
    }

}