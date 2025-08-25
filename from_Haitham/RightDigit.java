public class RightDigit {
    public List<Integer> replaceWithRightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n%10);
        return nums;

    }
}