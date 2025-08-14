public class MiddleTwo  {

    public String getMiddleTwoChars(String str) {
        int mid = (str.length()/2)-1;
        int sec= mid +2;
        return str.substring(mid,sec);
    }

}
