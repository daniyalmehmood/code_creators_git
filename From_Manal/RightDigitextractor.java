import java.util.List;
public class  RightDigitextractor {
    // Replace each number with its rightmost digit
    public List<Integer> extractRightDigit(List<Integer> numbers) {
        numbers.replaceAll(n -> Math.abs(n) % 10);
        return numbers;
    }
}