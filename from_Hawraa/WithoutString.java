public class WithoutString {
    public static String withoutRemoveString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        for (int i = 0; i < base.length(); ) {
            if (i + remove.length() <= base.length() && baseLower.substring(i, i + remove.length()).equals(removeLower)) {
                i += remove.length();
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(withoutRemoveString("Hello there", "llo"));
        System.out.println(withoutRemoveString("Hello there", "e"));
        System.out.println(withoutRemoveString("Hello there", "x"));
    }
}
