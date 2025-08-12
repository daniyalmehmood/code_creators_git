public class ExtraFront {
    public String repeatFrontThreeTimes(String str) {
        if (str.length() >= 2) {
            String FirstTow = str.substring(0, 2);
            return FirstTow + FirstTow + FirstTow;

        } else {
            return str + str + str;
        }
    }
}