public class AnswerCell {
    public static boolean shouldAnswerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            return isMom;
        }
        return true;
    }

        public static void main (String[] args){
            System.out.println(shouldAnswerCall(false, false, false));
            System.out.println(shouldAnswerCall(false, false, true));
            System.out.println(shouldAnswerCall(true, false, false));
        }

}


