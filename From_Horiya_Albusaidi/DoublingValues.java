import java.util.List;
public class DoublingValues {
    public List<Integer> doublingArrayElement(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

}
