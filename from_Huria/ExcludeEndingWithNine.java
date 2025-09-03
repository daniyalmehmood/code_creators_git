import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcludeEndingWithNine {
    public static List<Integer> excludeEndingWithNine(List<Integer> nums) {
        List<Integer> modifiableList = new ArrayList<>(nums);
        modifiableList.removeIf(n -> n % 10 == 9);
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(excludeEndingWithNine(Arrays.asList(1, 2, 19)));
        System.out.println(excludeEndingWithNine(Arrays.asList(9, 19, 29, 3)));
        System.out.println(excludeEndingWithNine(Arrays.asList(1, 2, 3)));
    }
}
