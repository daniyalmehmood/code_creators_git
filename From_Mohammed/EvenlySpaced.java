public class EvenlySpaced {
    public boolean areNumbersEvenlySpaced(int a, int b, int c) {
        return b - a == c - b || a - c == c - b || b - a == a - c;
    }
}
