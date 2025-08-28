public class Count11 {

    public int count11(String str) {
        if (str.length()<2) return 0;

        int add=0;
        if (str.substring(0,2).equals("11")){
            add=1;
            return add + count11(str.substring(2));
        }
        return add + count11(str.substring(1));
    }

}
