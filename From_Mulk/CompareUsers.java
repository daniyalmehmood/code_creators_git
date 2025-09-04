//AP-1 > userCompare
public class CompareUsers {
    public int compareUsersByNameThenId(String aName, int aId, String bName, int bId) {
        if (aName.equals(bName) && aId > bId) {
            return 1;
        }
        if (aName.equals(bName) && aId < bId) {
            return -1;
        }
        if ((aName.compareTo(bName)) > 0 && aId < bId) {
            return 1;
        }
        if ((aName.compareTo(bName)) < 0 && aId < bId) {
            return -1;
        }
        return 0;
    }

}