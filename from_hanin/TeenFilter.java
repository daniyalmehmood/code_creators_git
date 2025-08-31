import java.util.List;

public class TeenFilter {
    public List<Integer> filterOutTeens(List<Integer> nums) {
        nums.removeIf(s -> s >= 13 && s <= 19);
        return nums;
    }


}
