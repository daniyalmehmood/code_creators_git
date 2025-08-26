public class NameIdComparator {//AP-1 > userCompare
    public static void main(String[] args) {
        System.out.println(compareByNameAndId("bb", 1, "zz", 2)); // Expected: -1
        System.out.println(compareByNameAndId("bb", 1, "aa", 2)); // Expected: 1
        System.out.println(compareByNameAndId("bb", 1, "bb", 1)); // Expected: 0
    }
        public static int compareByNameAndId(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);

        if (nameCompare < 0) {
            return -1;//aName is alphabetically smaller
        }
        else if (nameCompare > 0) {
            return 1;
        }
        else {
            // Names are the same → compare IDs
            if (bId > aId) {
                return -1;// bId is bigger
            }
            else if (aId > bId) {
                return 1;// aId is bigger
            }
            return 0;//aId == bId
        }
    }

}
