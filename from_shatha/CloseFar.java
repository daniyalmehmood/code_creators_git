public class CloseFar {
    public static boolean isCloseFar(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bc = Math.abs(b - c);

        if (ab <= 1 && ac >= 2 && bc >= 2) {
            return true;
        }

        if (ac <= 1 && ab >= 2 && bc >= 2) {
            return true;
        }

        return false;

    }
      public static void main (String[] args){
      System.out.println(isCloseFar(1,2,10));
      System.out.println(isCloseFar(1,2,3));
      System.out.println(isCloseFar(4,1,3));
    }

}