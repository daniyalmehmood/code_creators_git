public class FrontBack {
    public String frontBack(String str) {
        if(str.length() <= 1) return str;
        String m =str.substring(1,str.length()-1);

        return str.charAt(str.length()-1)+m+str.charAt(0);}

}
