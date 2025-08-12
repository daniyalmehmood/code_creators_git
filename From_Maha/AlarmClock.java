public class AlarmClock {
    public String getAlarmTime(int day, boolean vacation){
        if (!vacation) {
            if (day > 0 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
        if (vacation) {
            if (day > 0 && day <= 5) {
                return "10:00";
            }
        }
        return "off";
    }
}