public class YakString {
    public static String stringYak(String str) {

        return str.replace("yak","");

    }

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("123yak"));
        System.out.println(stringYak("ya123"));
    }

}
