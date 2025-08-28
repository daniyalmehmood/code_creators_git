// Functional-2 > noTeen

public class WithoutTeen {
    public List<Integer> removeNumbersInTeenRange(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }
}