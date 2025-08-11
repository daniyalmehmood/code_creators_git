public class YakRemover {
    public static void main(String[] args) {
        System.out.println(removeYaksFromStr("yakpak")); //"pak"
        System.out.println(removeYaksFromStr("pakyak")); //"pak"
        System.out.println(removeYaksFromStr("yak123ya")); //"123ya"
    }
    public static String removeYaksFromStr(String str) {
        return str.replaceAll("yak", "");
    }
}
