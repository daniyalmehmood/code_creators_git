public class AlarmClockScheduler {
    public static String getAlarmTime(int day, boolean vacation) {
        if (!vacation && (0 < day && day < 6)) {
            return "7:00";
        } else if ((day == 0 || day == 6) && vacation) {
            return "off";
        }
        return "10:00";
    }

    public static void main(String[] args) {

        System.out.println(getAlarmTime(1, false));
        System.out.println(getAlarmTime(5, false));
        System.out.println(getAlarmTime(0, false));
        System.out.println(getAlarmTime(6, false));
    }
}
