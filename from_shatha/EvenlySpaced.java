public class EvenlySpaced {
    public static boolean isEvenlySpaced(int a, int b, int c) {
        int small = a;
        int medium = b;
        int large = c;

        if (b < small) small = b;
        if (c < small) small = c;

        if (a > large) large = a;
        if (b > large) large = b;
        if (c > large) large = c;

        medium = a + b + c - small - large;

        return (medium - small) == (large - medium);
    }
        public static void main (String[]args){
            System.out.println(isEvenlySpaced(2,4,6));
            System.out.println(isEvenlySpaced(4,6,2));
            System.out.println(isEvenlySpaced(4,6,3));
        }
    }

