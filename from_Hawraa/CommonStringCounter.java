// AP-1 > commonTwo
public class CommonStringCounter {
    public int countSharedStrings(String[] a, String[] b) {
        int sharedCount = 0;
        int i = 0;
        int j = 0;
        String lastMatched= "";
        while(i < a.length && j < b.length){
            int aCompareToB = a[i].compareTo(b[j]);
            if (aCompareToB == 0){
                if(!a[i].equals(lastMatched)){
                    sharedCount++;
                    lastMatched = a[i]; // Track last match to skip duplicates
                }
                i++;
                j++;
            } else if (aCompareToB < 0){
                i++;
            } else{
                j++;
            }
        }
        return sharedCount;
    }
}
