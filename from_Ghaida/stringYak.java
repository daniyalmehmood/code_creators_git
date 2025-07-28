public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak")); //"pak"
        System.out.println(stringYak("pakyak")); //"pak"
        System.out.println(stringYak("yak123ya")); //"123ya"
    }
    public static String stringYak(String str) {
//        StringBuilder newString = new StringBuilder();
//        for(int i = 0; i < str.length(); i++){
//            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
//                i += 2; // skip these 3 chars
//            } else {
//                newString.append(str.charAt(i));
//            }
//        }
//        return newString.toString();
        return str.replaceAll("yak", "");
    }
}
