public class AnswerCell {

    public boolean shouldAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMom) return true;
        if (isMorning) return false;
        return true;
    }

}
