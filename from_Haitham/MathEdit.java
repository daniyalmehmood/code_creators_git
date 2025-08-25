public class MathEdit {
   public List<Integer> mathAdding(List<Integer> nums) {
        nums.replaceAll(n -> (1 + n)*10);
        return nums;


    }
}