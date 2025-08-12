public class BobThere {
    public static boolean hasBAnyBPattern(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(hasBAnyBPattern("abcbob"));
        System.out.println(hasBAnyBPattern("b9b"));
        System.out.println(hasBAnyBPattern("bac") );
    }
}
