public class minCat {
    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        String front = str.substring(0, 2);
        String back  = str.substring(str.length() - 2);
        return front.equals(back);
    }
}
