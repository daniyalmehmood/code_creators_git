public class MinCat {
    public String concatByShortestLength(String a, String b) {

        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        return a + b.substring(b.length() - a.length());
    }
}
