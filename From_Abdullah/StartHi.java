public class StartHi {
    public boolean startsWithHi(String str) {

        if (str.length() < 2) {
            return false;
        }

        return str.substring (0,2).equals("hi");
    }

}
