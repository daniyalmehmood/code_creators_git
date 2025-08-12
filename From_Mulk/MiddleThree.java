public class MiddleThree {
    public String getMiddleThreeChars(String str) {
        if (str.length() >= 3) {
            int firstMiddle = str.length() / 2 - 1;
            int secondMiddle = str.length() / 2 + 2;
            return str.substring(firstMiddle, secondMiddle);
        } else {
            return str;
        }
    }
}

