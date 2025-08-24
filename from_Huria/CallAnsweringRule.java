public class CallAnsweringRule {
    public static boolean callAnsweringRule(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning && !isMom ){
            return false;
        }
        else return !isAsleep;
    }
    public static void main(String[] args) {

        System.out.println(callAnsweringRule(false, false, false));
        System.out.println(callAnsweringRule(false, false, true));
        System.out.println(callAnsweringRule(true, false, false));
    }
}
