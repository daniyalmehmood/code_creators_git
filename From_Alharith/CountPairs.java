public class CountPairs {

    public int countPairs(String str) {
        if (str.length()<=2) return 0;

        int add=0;
        if (str.charAt(0)==str.charAt(2)) add=1;

        return add + countPairs(str.substring(1));
    }

}
