public class hundred {
    public static void main(String[] args) {
      
        System.out.println(hundred(93));   
        System.out.println(hundred(90));  
        System.out.println(hundred(89));   
    }

    public static boolean hundred(int n) {
         if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return true;
        } else {
            return false;
        }
    }
}