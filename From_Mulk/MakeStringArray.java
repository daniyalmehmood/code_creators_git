// Array-2 > fizzArray2
public class MakeStringArray {
    public String[] generateStringArrayFromZero(int n) {
        String stringResult[] = new String[n];
        for (int i = 0; i < n; i++) {
            stringResult[i] = String.valueOf(i);
        }
        return stringResult;
    }

}