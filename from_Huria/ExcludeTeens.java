import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcludeTeens {
    public static List<Integer> excludeTeens(List<Integer> nums) {
        List<Integer> modifiableList = new ArrayList<>(nums);
        modifiableList.removeIf(n -> n >= 13 && n <= 19);
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(excludeTeens(Arrays.asList(12, 13, 19, 20)));
        System.out.println(excludeTeens(Arrays.asList(1, 14, 1)));
        System.out.println(excludeTeens(Arrays.asList(15)));
    }
}
