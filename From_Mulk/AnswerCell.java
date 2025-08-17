public class AnswerCell {
    public boolean checkIfAnswerOrNot(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && isMom && isAsleep) {
            return false;
        }
        if (!isMorning & !isMom & !isAsleep) {
            return true;
        }
        if (isMorning & isMom & !isAsleep) {
            return true;
        }
        if (!isMorning & isMom & !isAsleep) {
            return true;
        }
        if (!isMorning & !isMom & !isAsleep) {
            return true;
        }
        return false;
    }
}