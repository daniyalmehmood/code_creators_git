public class sleepIn {
    public static void main(String[] args) {
		
        System.out.println(sleepIn(false, false)); 
        System.out.println(sleepIn(true, false));  
        System.out.println(sleepIn(false, true));  
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false) {
            return true;
        } else if (vacation) {
            return true;
        } else {
            return false;
        }
    }
}