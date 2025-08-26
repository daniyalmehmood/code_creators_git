public class AdjacentHundredsChecker {//AP-1 > scores100

    public static void main(String[] args) {
        System.out.println(hasConsecutiveHundreds(new int[]{1, 100, 100}));          // → true
        System.out.println(hasConsecutiveHundreds(new int[]{1, 100, 99, 100}));      // → false
        System.out.println(hasConsecutiveHundreds(new int[]{100, 1, 100, 100}));     // → true
    }
    public static boolean hasConsecutiveHundreds(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if(scores[i] == 100 && scores[i + 1] == 100){
                return true;
            }
        }
        return false;
    }
}