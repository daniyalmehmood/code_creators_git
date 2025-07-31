public class Last2MatchCount {
    public static int last2MatchCount(String str) {
        int count = 0;
        String last2Index = "";
        if (str.length() < 2) return 0;

        String lastString = str.substring(str.length() - 2);


        for (int i = 0; i < str.length() - 2; i++) {
            last2Index = str.substring(i, i + 2);
            if (last2Index.equals(lastString)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(last2MatchCount("hixxhi"));
        System.out.println(last2MatchCount("xaxxaxaxx"));
        System.out.println(last2MatchCount("axxxaaxx"));
        System.out.println(last2MatchCount("xxaxxaxxaxx"));
        System.out.println(last2MatchCount("13121312"));
        System.out.println(last2MatchCount("hi"));

    }
}
