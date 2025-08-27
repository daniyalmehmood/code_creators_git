public class ParrotHours {
    public static boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour <=6 || hour > 20)){

            return true;

        }else return false;
    }

    public static void main(String[] args) {

        System.out.println(parrotTrouble(true,8));
        System.out.println(parrotTrouble(true, 6));

    }

}

// end of the code !

