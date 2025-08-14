public class AlarmClock {

    public String getAlarmTime(int day, boolean vacation) {
        if ((day==0 || day ==6) && vacation ) return "off";
        if (day>=1 && day<=5 && !vacation) return "7:00";
        return "10:00";
    }

}
