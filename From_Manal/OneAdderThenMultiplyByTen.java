import java.util.List;
public class  OneAdderThenMultiplyByTen{
    // For each number, add 1 and then multiply by 10
    public List<Integer> addOneThenMultiplyByTen(List<Integer> numbers) {
        numbers.replaceAll(n -> (n + 1) * 10);
        return numbers;
    }
}