public class ExtraEnd {
    public String extraEnd(String str) {

        if (str.length() <= 2) {
            return str + str + str;
        }
        String newString = str.substring(str.length() - 2);
        return newString + newString + newString;
    }
}