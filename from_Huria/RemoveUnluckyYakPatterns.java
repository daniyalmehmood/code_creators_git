public class RemoveUnluckyYakPatterns {

    public static String removeUnluckyYakPatterns(String str) {
        StringBuilder result = new StringBuilder();
        int x = str.length();

        for (int i = 0; i < x; i++) {
            if (x > i + 2 && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {

                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeUnluckyYakPatterns("yakpak"));
        System.out.println(removeUnluckyYakPatterns("pakyak"));
        System.out.println(removeUnluckyYakPatterns("yak123ya"));
        System.out.println(removeUnluckyYakPatterns("ybk123"));
    }
}


