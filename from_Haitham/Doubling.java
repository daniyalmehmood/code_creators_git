public class Doubling {
    public List<Integer> doublingAllNumbers(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }