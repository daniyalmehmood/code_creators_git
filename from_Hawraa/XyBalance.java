public class XyBalance {
    public static boolean isXyBalanced(String str) {
        boolean balanceX = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                balanceX = false;
            } else if (str.charAt(i) == 'y') {
                balanceX = true;
            }
        }
        return balanceX;
    }

    public static void main(String[] args) {
        System.out.println(isXyBalanced("aaxbby"));
        System.out.println(isXyBalanced("aaxbb"));
        System.out.println(isXyBalanced("yaaxbb"));
    }
}
