public class ScoresClumpChecker {//AP-1 > scoresClump

    public static void main(String[] args) {
        System.out.println(hasClump(new int[]{3, 4, 5}));          // → true
        System.out.println(hasClump(new int[]{3, 4, 6}));          // → false
        System.out.println(hasClump(new int[]{1, 3, 5, 5}));       // → true
    }
    public static boolean hasClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i+2] - scores[i]) <= 2){
                return true;
            }
        }
        return false;
    }
}