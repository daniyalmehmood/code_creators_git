public class BobThere {
    public static boolean hasBobPattern(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    public static void main (String[]args){
        System.out.println(hasBobPattern("abcbob"));
        System.out.println(hasBobPattern("b9b"));
        System.out.println(hasBobPattern("bac"));
    }
}

