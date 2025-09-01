public class ClockTimer {
    public String toFindAlarmTime(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);

        if (vacation) {
            if (isWeekend) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (isWeekend) {
                return "10:00";
                // if we are on vacation, return a string of the form "7:00"
            } else {
                return "7:00";
            }
        }
    }

}
