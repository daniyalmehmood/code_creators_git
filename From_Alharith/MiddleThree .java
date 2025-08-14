public class MiddleThree {

    public String getMiddleThreeChars(String str) {
        int mid = str.length()/2;
        if (str.length()<4) return str;

        return str.substring(mid-1,mid+2 );
    }

}
