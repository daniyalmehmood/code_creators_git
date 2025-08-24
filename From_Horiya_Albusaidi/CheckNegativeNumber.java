import java.util.List;

public class CheckNegativeNumber {
    public List<Integer> removeNegativeElement(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

}
