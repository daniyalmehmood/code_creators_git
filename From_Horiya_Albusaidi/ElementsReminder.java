import java.util.List;

public class ElementsReminder {
    public List<Integer> getElementsRightDigits(List<Integer> nums) {
        nums.replaceAll(num -> num % 10);
        return nums;
    }

}
