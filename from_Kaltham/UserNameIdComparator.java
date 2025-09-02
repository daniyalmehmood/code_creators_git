//AP-1 > userCompare

public class UserNameIdComparator {
    public int compareByNameThenId(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else {
            if (aId < bId) {
                return -1;
            } else if (aId > bId) {
                return 1;
            }
        }
        return 0;
    }
}