public class FirstTwo {
    public String getFirstTwoChar(String str) {
        if (str.length() < 2) return str;
        else return str.substring(0, 2);
    }

}
