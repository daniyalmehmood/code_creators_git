import java.util.List;
public class  SquareValues {
    // Square each number in the list
    public List<Integer> squareValues(List<Integer> numbers) {
        numbers.replaceAll(n -> n * n);
        return numbers;
    }
}