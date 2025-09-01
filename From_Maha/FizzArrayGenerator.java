//Array-2 > fizzArray2
public class FizzArrayGenerator {
    public String[] generateStringArray(int n) {
        String[] newArray = new String[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = String.valueOf(i);
        }
        return newArray;
    }
}
