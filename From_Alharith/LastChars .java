public class LastChars   {

    public String getFirstOfAAndLastOfB(String a, String b) {
        if (a.length()<1 && b.length()<1) return "@@";
        if (a.length()<1) a="@";
        if (b.length()<1) b="@";


        if (a.length()>1) {
            a= a.substring(0,1);
        }
        if (b.length()>1){
            b= b.substring(b.length()-1);

        }
        return a+b;
    }

}
