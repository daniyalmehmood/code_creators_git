public class GHappy {
    public static boolean gLeftOrRightG(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftG = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
                if (!leftG && !rightG) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(gLeftOrRightG("xxggxx"));
        System.out.println(gLeftOrRightG("xxgxx"));
        System.out.println(gLeftOrRightG("xxggyygxx"));
    }
}