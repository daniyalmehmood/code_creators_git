public class AnswerCell {

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMorning) return isMom;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(answerCell(false, false, false)); // true
        System.out.println(answerCell(false, false, true));  // false
        System.out.println(answerCell(true, false, false));  // false
    }
}