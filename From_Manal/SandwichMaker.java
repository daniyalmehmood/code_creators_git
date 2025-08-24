public class SandwichMaker {

    public static String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        // Check if there are at least two "bread" pieces
        if (firstBread != -1 && lastBread != -1 && firstBread != lastBread) {
            return str.substring(firstBread + 5, lastBread);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }
}