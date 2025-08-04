public class BaseWithoutMatch {
    public static void main(String[] args) {
        System.out.println(withoutRemoveMatch("Hello there", "llo"));  // "He there"
        System.out.println(withoutRemoveMatch("Hello there", "e"));    // "Hllo thr"
        System.out.println(withoutRemoveMatch("Hello there", "x"));    // "Hello there"
        System.out.println(withoutRemoveMatch("MkjtMkx", "Mk") );    // "Hello there"
    }

    public static String withoutRemoveMatch(String base, String remove) {
        if (remove.isEmpty()) {
            return base;  // do not remove anything
        }
        StringBuilder result = new StringBuilder();
        String lowerTheBase = base.toLowerCase();
        String lowerTheRemove = remove.toLowerCase();
        int i = 0;
        while (i < base.length()) {//while--> because no point to stop at it
            if (i <= base.length() - remove.length() && lowerTheBase.substring(i, i + remove.length()).equals(lowerTheRemove)) {
                i += remove.length(); // If a match is found, skip the length of 'remove'
            }
            else {
                result.append(base.charAt(i));// If no match, append the current character
                i++;
            }
        }
        return result.toString();
    }
}
