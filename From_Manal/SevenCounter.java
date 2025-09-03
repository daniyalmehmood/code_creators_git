//Recursion-1 > count7
public class SevenCounter {
    public static int countSeven(int n) {
        if (n==0){
            return 0;
        }
        if(n%10==7){
            return 1+countSeven(n/10);}

        return countSeven(n/10);
    }

    public static void main (String args[]){
        System.out.println(countSeven(717) );
        System.out.println(countSeven(7));
        System.out.println(countSeven(123) );
    }
    }
