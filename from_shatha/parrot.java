public class parrot {
    public static void main(String[] args) {
        System.out.println(parrot(true,6));    
        System.out.println(parrot(true,7));  
        System.out.println(parrot(false,6));   
    }

    public static boolean parrot(boolean talking,int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }
}
