public class CallResponse {
    public boolean shouldAnswerCall(boolean isMorning, boolean callerIsMom, boolean isAsleep) {
        if (isAsleep) {
            return false; // Never answer if asleep
        }
        if (isMorning) {
            return callerIsMom; // Only answer in the morning if it's mom
        }
        return true; // Otherwise, answer
    }
}
