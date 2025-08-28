//Functional-2 > no9

public class RemoveNine {
    public List<Integer> removeLastDigitNine(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}