public class ConCat {
    public static String mergeStrings(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        } else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public static void main(String[] args){
        System.out.println(mergeStrings("abc", "cat"));
        System.out.println(mergeStrings("dog", "cat"));
        System.out.println(mergeStrings("abc", ""));
    }
}
