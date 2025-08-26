import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquarePlusTenRemoveEnds {//Functional-2 > square56

    public static void main(String[] args) {
        System.out.println(squarePlusTenFilter(Arrays.asList(3, 1, 4)));   // → [19, 11]
        System.out.println(squarePlusTenFilter(Arrays.asList(1)));          // → [11]
        System.out.println(squarePlusTenFilter(Arrays.asList(2)));          // → [14]
    }
    public static List<Integer> squarePlusTenFilter(List<Integer> nums) {
        List<Integer> modifiableList = new ArrayList<>(nums);
        modifiableList.replaceAll(number -> (number * number) + 10);
        modifiableList.removeIf(number -> number % 10 == 5 || number % 10 == 6);
        return modifiableList;
    }
}