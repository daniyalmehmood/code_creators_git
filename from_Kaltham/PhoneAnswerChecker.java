//Logic-1 > answerCell

public class PhoneAnswerChecker {
    public boolean canAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isMorning && isMom && !isAsleep) {
            return true;
        } else if (isMorning && isMom && !isAsleep) {
            return true;
        } else if (!isMorning && !isMom && !isAsleep) {
            return true;
        }
        return false;
    }
}