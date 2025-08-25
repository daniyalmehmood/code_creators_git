public class Square {
    public List<Integer> squareAllElement(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}