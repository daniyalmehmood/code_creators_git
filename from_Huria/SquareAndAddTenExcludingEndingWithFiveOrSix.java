import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareAndAddTenExcludingEndingWithFiveOrSix {
    public static List<Integer> squareAndAddTenExcludingEndingWithFiveOrSix(List<Integer> nums) {
        List<Integer> modifiableList = new ArrayList<>(nums);
        modifiableList.replaceAll(n -> ((n * n) + 10));
        modifiableList.removeIf(n -> (n % 10 == 5 || n % 10 == 6));
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(squareAndAddTenExcludingEndingWithFiveOrSix(Arrays.asList(3, 1, 4)));
        System.out.println(squareAndAddTenExcludingEndingWithFiveOrSix(Arrays.asList(1)));
        System.out.println(squareAndAddTenExcludingEndingWithFiveOrSix(Arrays.asList(2)));
    }
}
