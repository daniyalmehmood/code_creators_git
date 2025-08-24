public class GetSandwich {
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last  = str.lastIndexOf("bread");
        if (first == -1 || first == last) return "";
        return str.substring(first + 5, last);
    }

    public static void main(String[] args) {
        GetSandwich gs = new GetSandwich();
        System.out.println(gs.getSandwich("breadjambread"));
        System.out.println(gs.getSandwich("xxbreadjambreadyy"));
        System.out.println(gs.getSandwich("xxbreadyy"));
    }
}