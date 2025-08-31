public class LoneSum {
    public static int sumWithoutDuplicates(int a, int b, int c) {
       if(a==b&&a==c){
           return 0;
       }
       else if (a==b) {
            return c;
        } else if (a==c) {
            return b;
        } else if (b==c) {
            return a;
        } else  {
            return a+b+c;
        }
    }
        public static void main (String[] args){
            System.out.println(sumWithoutDuplicates(1,2,3));
            System.out.println(sumWithoutDuplicates(3,2,3));
            System.out.println(sumWithoutDuplicates(3,3,3));
        }
    }


