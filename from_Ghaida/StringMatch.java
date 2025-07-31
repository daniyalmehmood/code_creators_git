public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz")); //3
        System.out.println(stringMatch("abc", "abc")); //2
        System.out.println(stringMatch("abc", "axc")); //0
    }
    public static int stringMatch(String a, String b) {
        int count = 0;
        int minLengthofStrings = Math.min(a.length(), b.length());//length should be same
        for (int i = 0; i < minLengthofStrings - 1; i++) {
            String subOfA = a.substring(i, i + 2);
            String subOfB = b.substring(i, i + 2);
            if (subOfA.equals(subOfB)) {
                    count++;
                }
            }
        return count;
    }
}
