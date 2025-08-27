// AP-1 > userCompare
public class UsersDataComparator {
    public int compareUsersData(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);
        if (nameCompare > 0) { // aName after bName
            return 1;
        } else if (nameCompare < 0) { // aName before bName
            return -1;
        } else { // nameCompare == 0
            if (aId < bId) {
                return -1;
            } else if (aId > bId) {
                return 1;
            }
        }
        return 0; // aId == bId
    }
}