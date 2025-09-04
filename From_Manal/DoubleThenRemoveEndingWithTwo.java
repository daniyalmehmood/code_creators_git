  import java.util.List;
    public class  DoubleThenRemoveEndingWithTwo {
        //Multiply by 2, then remove numbers ending with digit 2
        public List<Integer> doubleThenRemoveEndingWithTwo(List<Integer> numbers) {
            numbers.replaceAll(s -> s * 2);
            numbers.removeIf(s -> s % 10 == 2);
            return numbers;
        }
    }