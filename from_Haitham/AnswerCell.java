public class AnswerCell {
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if (isMorning) return isMom;
            else return true;
        }
        return false;
    }
}
