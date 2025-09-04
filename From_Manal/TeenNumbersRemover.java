    import java.util.List;
    public class  TeenNumbersRemover {
        //  Remove numbers between 13 and 19 (inclusive)
        public List<Integer> removeTeenNumbers(List<Integer> numbers) {
            numbers.removeIf(n -> n >= 13 && n <= 19);
            return numbers;
        }
    }