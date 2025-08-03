public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak")); //"pak"
        System.out.println(stringYak("pakyak")); //"pak"
        System.out.println(stringYak("yak123ya")); //"123ya"
    }
    public static String stringYak(String str) {
        return str.replaceAll("yak", "");
    }
}
