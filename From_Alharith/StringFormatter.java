public class StringFormatter {

    public String capitalizeLastThree(String str) {
        if (str.length()<=3) return str.toUpperCase();

        int length = (str.length()-3);
        String last = str.substring (length);
        String front= str.substring (0,length);
        return front + last.toUpperCase() ;
    }

}
