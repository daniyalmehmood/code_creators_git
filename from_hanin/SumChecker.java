public class SumChecker {
    public boolean isSumOfTwoEqualToThird(int a, int b, int c) {
        //return true if it is possible to add two of the ints to get the third.
        return (a + b == c) || (a + c == b) || (b + c == a);
    }
}
