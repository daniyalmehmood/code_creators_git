public class SumLimit {
public int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
        if (String.valueOf(a + b).length() == aString.length()) return a + b;
        return a;
    }
}
