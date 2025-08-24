import java.util.List;
public class MultiplicationProcess {
    public List<Integer> multipliedArrayElementWithItSelf(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

}
