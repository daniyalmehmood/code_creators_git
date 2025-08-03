public class ExtraEnd {
    public String extraEnd(String str) {


        if (str.length() >= 2) {
            String last = str.substring(str.length() - 2);


            return last + last + last;
        } else return "";
    }
}