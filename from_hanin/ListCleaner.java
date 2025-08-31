import java.util.List;

public class ListCleaner {
    public List<Integer> removeNegatives(List<Integer> nums) {
        nums.removeIf(s -> s < 0);
        return nums;
    }

}
