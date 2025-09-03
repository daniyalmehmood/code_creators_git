public class AnswerCall {
    public static boolean shouldAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isAsleep && (!isMorning || isMom));
    }
    public static void main(String[] args) {
        System.out.println(shouldAnswerCall(false, false, false));
        System.out.println(shouldAnswerCall(false, false, true));
        System.out.println(shouldAnswerCall(true, false, false));
    }
}
