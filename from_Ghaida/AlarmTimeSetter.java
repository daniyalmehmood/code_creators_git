public class AlarmTimeSetter {
    public static void main(String[] args) {
        System.out.println(getAlarmTime(1, false));// → "7:00"
        System.out.println(getAlarmTime(5, false));// → "7:00"
        System.out.println(getAlarmTime(0, false));// → "10:00"
    }
    public static String getAlarmTime(int day, boolean vacation) {
        if(vacation){
            if(day == 0 || day == 6){
                return "off";
            }
            return "10:00";
        }
        if(day == 0 || day == 6){
            return "10:00";
        }
        return "7:00";
    }
}
