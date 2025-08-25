public class FrontBackMatcher {
    public boolean isFrontEqualToBack(String str) {
        String front = str.substring(0, 2);
        String back = str.substring(str.length() - 2);
        if (str.length()>2 && front.equals(back)) {
            return true;
        }
        if (str.length() == 2) {
            return true;
        }
        else if(str.length() <=1  ) {
            return false;}
        return false;
    }
}