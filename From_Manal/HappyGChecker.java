public class HappyGChecker {
    // Method to check if all 'g' characters are happy
    public static boolean areAllGsHappy(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'g') {
                boolean hasLeftG = (i > 0 && text.charAt(i - 1) == 'g');
                boolean hasRightG = (i < text.length() - 1 && text.charAt(i + 1) == 'g');
                // If no 'g' to the left or right, this 'g' is unhappy
                if (!hasLeftG && !hasRightG) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAllGsHappy("xxggxx"));
        System.out.println(areAllGsHappy("xxgxx"));
        System.out.println(areAllGsHappy("xxggyygxx"));
    }
}