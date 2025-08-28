//Functional-2 > noNeg

public class NoNegative {
    public List<Integer> removeNegativeNumbers(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
}