public class AnswerCall {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if(isMorning && isMom && !isAsleep) return true;
        if(!isMorning && isMom && !isAsleep) return true;
       else if(!isMorning && !isMom && !isAsleep) return true;
        else if(isAsleep) return false;
        else return false;

        }
    }


