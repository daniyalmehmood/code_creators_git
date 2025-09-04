    import java.util.List;
    public class NumbersReplacerAndRemover  {
    // Replace each number with (n^2 + 10), then remove if it ends with 5 or 6
    public List<Integer> squarePlusTenRemoveEndingWith5Or6(List<Integer> numbers) {
        numbers.replaceAll(n -> n * n + 10);
        numbers.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return numbers;
    }
}