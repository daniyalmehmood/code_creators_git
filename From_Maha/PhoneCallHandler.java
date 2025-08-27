public class PhoneCallHandler {
    public boolean shouldAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && isMom) {
            return true;
        }
        if (isMorning) {
            return false;
        }
        return true;
    }
}