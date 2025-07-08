public class monkeysmile {

    public static boolean monkeyTruble(boolean aSmile, boolean bSmile) {

        if (aSmile == true && bSmile == true) {

            System.out.println("there is a trouble\t");
            return true;
        } else if (aSmile == false && bSmile == false) {
            System.out.println("there is a trouble\t");
            return true;
        } else {
            System.out.printf("no trouble\t");
            return false;
        }
    }
    public static void main(String[] args){

        System.out.println(monkeyTruble(true,true));
        System.out.println(monkeyTruble(false,false));
        System.out.println(monkeyTruble(true,false));
    }
}
