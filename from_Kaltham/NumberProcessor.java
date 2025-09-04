//Functional-2 > square56


import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {

    public List < Integer > processNumbersSquareAddTen(List < Integer > nums) {
        List < Integer > result = nums.stream().map(n->(n * n) + 10).filter(n->n % 10 != 5 && n % 10 != 6).collect(Collectors.toList());

        return result;
    }

}