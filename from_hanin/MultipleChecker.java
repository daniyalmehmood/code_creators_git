public class MultipleChecker {
    public boolean  isMultipleOf3Or5(int n) {
        boolean multipleOf3 = (n % 3 == 0);
        boolean multipleOf5 = (n % 5 == 0);
        return multipleOf3 ^ multipleOf5;
    }

}
