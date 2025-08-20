public class SumLimit {
    public static int sumWithLimit(int a, int b) {
     if(String.valueOf(a).length()==String.valueOf(a+b).length()){
         return a+b;
     }
     else{
         return a;

     }




    }
        public static void main (String[] args){
            System.out.println(sumWithLimit(2,3));
            System.out.println(sumWithLimit(8,3));
            System.out.println(sumWithLimit(8,1));
        }
}
