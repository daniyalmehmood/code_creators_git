public class IsXyzInMiddle {
    public boolean hasCenteredXyz(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                String leftMiddle = str.substring(0, i);
                String rightMiddle = str.substring(i + 3);
                int Difference = leftMiddle.length() - rightMiddle.length();
                if (Difference == 0 || Difference == 1 || Difference == -1) {
                    return true;
                }
            }
        }
        return false;

    }
}
