public class AlarmClock {
    public static String getAlarmTime(int dayOfWeek, boolean isVacation) {
        boolean isWeekend = (dayOfWeek == 0 || dayOfWeek == 6);
        if (isVacation) return isWeekend ? "off" : "10:00";
        else return isWeekend ? "10:00" : "7:00";
    }
    public static void main(String[] args) {
        System.out.println(getAlarmTime(1, false)); // 7:00 (Monday)
        System.out.println(getAlarmTime(6, false)); // 10:00 (Saturday)
        System.out.println(getAlarmTime(0, true));  // off (Sunday vacation)
        System.out.println(getAlarmTime(3, true));  // 10:00 (Wednesday vacation)
    }
}