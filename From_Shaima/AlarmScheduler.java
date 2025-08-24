public class AlarmScheduler {
    public static String alarmClock(int day, boolean vacation) {
        if ((0<day && day<6) && !vacation)return "7:00"; //  return "7:00" if it is week day and no vacation
        if ((day==0 || day==6 )&& vacation) return "off"; // return "off" if it is weekend and  vacation
        return "10:00"; // return "10:00" if it is week day and vacation
    }
    public static void main(String[] args){
        System.out.println(alarmClock(1, false));
    }
}
