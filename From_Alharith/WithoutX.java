public class WithoutX {

    public String removeXFromEnds(String str) {
        String result="";
        if (str.length()<2) return "";
        if (str.charAt(0)==('x')) result += str.substring(1,str.length()-1);
        if (!(str.charAt(0)==('x'))) result += str.substring(0,str.length()-1);
        if (!(str.charAt(str.length()-1)==('x'))) result += str.charAt(str.length()-1);
        return result;
    }

}
