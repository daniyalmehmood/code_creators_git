//AP-1 > commonTwo
public class CommonElements {
    public int countCommonUniqueStrings(String[] a, String[] b) {
        int count = 0;
        String newString = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j]) && !newString.contains(a[i])) {
                    newString += a[i];
                    count++;


                }
            }
        }
        return count;
    }
}