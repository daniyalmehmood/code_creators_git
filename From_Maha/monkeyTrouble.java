public class monkeyTrouble {
    public static boolean monkeyInTrouble(boolean aSmile, boolean bSmile){
        if (aSmile == true && bSmile==true){
            return true;}
        if (aSmile == false && bSmile==false){
            return true;}

        else
        { return false;} }



    public static void main(String[] args){
        System.out.println(monkeyInTrouble(false , false));
    }}
