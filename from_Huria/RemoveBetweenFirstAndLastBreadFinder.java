public class RemoveBetweenFirstAndLastBreadFinder {
    public static String removeStringBetweenFirstAndLastBread(String str) {
        if (str.length() < 11) return "";
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");
        return str.substring(firstIndex + 5, lastIndex);

    }

    public static void main(String[] args) {

        System.out.println(removeStringBetweenFirstAndLastBread("breadjambread"));
        System.out.println(removeStringBetweenFirstAndLastBread("xxbreadbreadjambreadyy"));
        System.out.println(removeStringBetweenFirstAndLastBread("breadbreadbreadbread"));
    }
}
