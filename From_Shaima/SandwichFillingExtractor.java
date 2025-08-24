public class SandwichFillingExtractor {
    public static String getFillingBetweenBread(String str) {
        if (str.length() < 11) return ""; // the str does not contain 2 bread
        int firstBreadIndex = str.indexOf("bread"); // initialize a variable to store the index of first bread in the str
        int lastBreadIndex = str.lastIndexOf("bread"); // initialize a variable to store the index of last bread in the str
        return str.substring(firstBreadIndex + 5 ,lastBreadIndex); // return the between firest and last breads in the str
    }
    public static void main(String[] args) {
        System.out.println(getFillingBetweenBread("breadjambread"));
    }
}
