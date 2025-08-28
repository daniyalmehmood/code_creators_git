public class BobThere {
    public boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BobThere bt = new BobThere();
        System.out.println(bt.bobThere("abcbob"));
        System.out.println(bt.bobThere("b9b"));
        System.out.println(bt.bobThere("bac"));
    }
}