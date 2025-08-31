import java.util.List;

public class AddOneMultiplyTen {
    public List<Integer> addOneMultiplyTen(List<Integer> nums) {
        nums.replaceAll(s -> (s + 1) * 10);
        return nums;
    }

}
