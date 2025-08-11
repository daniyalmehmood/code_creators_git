public class LastTwoChars {
    public static void main(String[] args) {
        System.out.println(countMatchingLastTwoPairs("hixxhi")); //1
        System.out.println(countMatchingLastTwoPairs("xaxxaxaxx")); //1
        System.out.println(countMatchingLastTwoPairs("axxxaaxx")); //2
    }
    public static int countMatchingLastTwoPairs(String str) {
        if (str.length() < 2) {//string can't be less 2 character
            return 0;
        }
        String lastTwoChars = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(lastTwoChars)) {
                count++;
            }
        }
        return count;
    }
}