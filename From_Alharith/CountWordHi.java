public class CountWordHi {

    public int countHi(String str) {
        if (str.length()<2) return 0;

        int add=0;
        if (str.substring(0,2).equals("hi")) add=1;

        return add + countHi(str.substring(1));
    }

}
