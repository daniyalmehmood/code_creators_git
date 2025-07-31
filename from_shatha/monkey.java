public class monkey {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));  
        System.out.println(monkeyTrouble(false, false)); 
        System.out.println(monkeyTrouble(true, false));  
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }
}
