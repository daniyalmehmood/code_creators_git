public class AlarmClock {
    public static String getAlarmTime(int day, boolean vacation) {
        if (!vacation && day >= 1 && day <= 5){
            return "7:00";
        } else if(vacation && day >= 1 && day <= 5){
            return "10:00";
        }
        else if (!vacation && (day == 0 || day == 6)){
            return "10:00";
        }
        return "off";
    }

    public static void main(String[] args) {
        System.out.println(getAlarmTime(1, false));
        System.out.println(getAlarmTime(5, false));
        System.out.println(getAlarmTime(0, false));
    }
}
