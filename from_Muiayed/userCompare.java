public class userCompare {
    public static int userCompare(String aName, int aId,
                                  String bName, int bId) {
        int cmp = aName.compareTo(bName);
        if (cmp != 0) return cmp < 0 ? -1 : 1;
        return Integer.compare(aId, bId);
    }

    public static void main(String[] args) {
        System.out.println(userCompare("bb", 1, "zz", 2));
        System.out.println(userCompare("bb", 1, "aa", 2));
        System.out.println(userCompare("bb", 1, "bb", 1));
    }
}