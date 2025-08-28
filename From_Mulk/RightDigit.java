//Functional-1 > rightDigit

public class RightDigit {
    public List<Integer> replaceWithRightmostDigit(List<Integer> nums) {
        nums.replaceAll(s -> s % 10);
        return nums;
    }

}
