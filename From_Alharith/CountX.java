public class CountX {

    public int countX(String str) {
        if (str.length() == 0) return 0;

        int add = 0;
        if (str.charAt(0) == 'x') {
            add = 1;
        }

        return add + countX(str.substring(1));
    }
}
