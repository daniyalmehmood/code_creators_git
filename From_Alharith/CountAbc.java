public class CountAbc {

    public int countAbc(String str) {
        if (str.length()<3) return 0;

        int add=0;
        if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){
            add=1;
        }
        return add + countAbc(str.substring(1));
    }

}
