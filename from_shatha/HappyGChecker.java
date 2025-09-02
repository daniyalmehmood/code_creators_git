public class HappyGChecker {
    public static boolean areAllGsHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean hasLeftG = (i > 0 && str.charAt(i - 1) == 'g');
                boolean hasRightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');

                if (!hasLeftG && !hasRightG) {
                    return false;
                }
            }
        }
        return true;
    }

public static void main(String arg[]){
    System.out.println(areAllGsHappy("xxggxx"));
    System.out.println(areAllGsHappy("xxgxx"));
    System.out.println(areAllGsHappy("xxggyygxx"));
}
}
