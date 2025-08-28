public class StrCount {

    public int strCount(String str, String sub) {
        if (str.length()<sub.length()) return 0;
        int add=0;
        if (str.substring(0,sub.length()).equals(sub)) {
            add=1;
            return add + strCount(str.substring(sub.length()),sub);
        }

        return add + strCount(str.substring(1),sub);
    }

}
