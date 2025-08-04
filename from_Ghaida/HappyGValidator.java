public class HappyGValidator {
    public static void main(String[] args) {
        System.out.println(hasAllHappyGs("xxggxx"));// → true
        System.out.println(hasAllHappyGs("xxgxx"));// → false
        System.out.println(hasAllHappyGs("xxggyygxx"));// → false
    }
    public static boolean hasAllHappyGs(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if ((i == 0 || str.charAt(i - 1) != 'g') && (i == str.length() - 1 || str.charAt(i + 1) != 'g')) {
                    return false; // 'g' is not happy
                }
            }
        }
        return true;
    }
}
