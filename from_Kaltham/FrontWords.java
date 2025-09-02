//AP-1 > wordsFront

public class FrontWords {
    public String[]takeFront(String[]words, int n) {
        String[]newArray = new String[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = words[i];
        }
        return newArray;
    }
}