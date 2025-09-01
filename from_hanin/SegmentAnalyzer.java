public class SegmentAnalyzer {
    public int getMaxSpanLength(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.length() == sub.length()) {
            if (str.equals(sub)) {
                return str.length();
            } else {
                return 0;
            }
        } else {
            String first = str.substring(0, sub.length());
            String last = str.substring(str.length() - sub.length());
            if (first.equals(sub) && last.equals(sub)) {
                return str.length();
            } else if (first.equals(sub) && !last.equals(sub)) {
                return getMaxSpanLength(str.substring(0, str.length() - 1), sub);

            } else if (!first.equals(sub) && last.equals(sub)) {
                return getMaxSpanLength(str.substring(1), sub);


            } else {
                return getMaxSpanLength(str.substring(1, str.length() - 1), sub);

            }
        }


    }


}