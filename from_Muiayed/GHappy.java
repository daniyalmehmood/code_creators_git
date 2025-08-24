public class GHappy {
    public static boolean gHappy(String str) {
        if (str == null) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean left = i > 0 && str.charAt(i - 1) == 'g';
                boolean right = i < str.length() - 1 && str.charAt(i + 1) == 'g';
                if (!left && !right) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }
}