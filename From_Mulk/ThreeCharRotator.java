public class ThreeCharRotator {
    public String shiftFirstCharToEndInTriplets(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 2 < str.length()) {
                result += str.substring(i + 1, i + 2) + str.substring(i + 2, i + 3) + str.substring(i, i + 1);
            }
        }
        return result;
    }
}
