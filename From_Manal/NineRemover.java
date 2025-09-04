   import java.util.List;
    public  class  NineRemover {
        //  Remove numbers ending with digit 9
        public List<Integer> removeEndingWithNine(List<Integer> numbers) {
            numbers.removeIf(n -> n % 10 == 9);
            return numbers;
        }
    }