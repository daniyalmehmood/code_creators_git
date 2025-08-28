public class AlarmClock {

    public static String alarmClock(int day, boolean vacation) {
        boolean weekend = (day == 0 || day == 6);
        if (vacation) {
            return weekend ? "off" : "10:00";
        } else {
            return weekend ? "10:00" : "7:00";
        }
    }

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false)); // 7:00
        System.out.println(alarmClock(5, false)); // 7:00
        System.out.println(alarmClock(0, false)); // 10:00
    }
}