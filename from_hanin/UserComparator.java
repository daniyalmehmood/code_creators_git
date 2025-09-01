public class UserComparator {
    public int compareByNameAndId(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) == 0) {
            if (aId < bId) {
                return -1;
            } else if (aId > bId) {
                return 1;
            } else {
                return 0;
            }
        }
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else {
            return 1;
        }

    }

}
