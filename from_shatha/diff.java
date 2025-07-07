public class diff {
    public static void main(String[] args) {
        System.out.println(diff(19));    
        System.out.println(diff(10));  
        System.out.println(diff(21));   
    }

    public static int diff(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return 2 * (n - 21);
        }
    }
}
