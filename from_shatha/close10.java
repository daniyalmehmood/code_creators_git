public class close10 {
    public static int close10(int a, int b) {
       
	   int diffa = Math.abs(a - 10);
        int diffb= Math.abs(b - 10);

        if (diffa < diffb) {
            return a;
        } else if (diffb < diffa) {
            return b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
      
        System.out.println(close10(8, 13));  
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));  
       
    }
}
