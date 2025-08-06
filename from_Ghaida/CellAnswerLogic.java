public class CellAnswerLogic {
    public static void main(String[] args) {
        System.out.println(shouldAnswerCall(false, false, false));// → true
        System.out.println(shouldAnswerCall(false, false, true));// → false
        System.out.println(shouldAnswerCall(true, false, false));// → false
    }
    public static boolean shouldAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if(isMorning) {
                if (isMom) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
