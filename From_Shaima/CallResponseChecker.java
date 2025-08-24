public class CallResponseChecker {
    public static boolean shouldAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false; // while sleeping do not answer the call
        if (isMorning && !isMom)return false; // if it is morning but not the mom do not answer the call
        return true; // in all other cases answer the call
    }
    public static void main(String[] args){
        System.out.println(shouldAnswerCall(false, false, true));
    }
}
