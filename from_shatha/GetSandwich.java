public class GetSandwich {
    public static String getFilling(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || last == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }
    public static void main (String[]args){
        System.out.println(getFilling("breadjambread"));
        System.out.println(getFilling("xxbreadjambreadyy") );
        System.out.println(getFilling("xxbreadyy"));
    }
}
