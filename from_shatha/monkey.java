public class monkey {
    public static void main(String[] args) {
        System.out.println(monkey(true,true));    
        System.out.println(monkey(false,false));  
        System.out.println(monkey(true,false));   
    }

    public static boolean monkey(boolean aSmile,boolean bSmile) {
        if (aSmile == true)&&(bSmile == true) {
            return true;
        } else (aSmile == false)&&(bSmile == false){
            return false;
        }
    }
}