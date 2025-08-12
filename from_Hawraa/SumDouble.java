public class SumDouble{
 public static int sumDouble(int a, int b){
   if (a != b){
     return a + b;
   }
   else{
     return 2* (a + b);
   }
 }
  public static void main(String[] args) {
     System.out.println(sumDouble(1, 2));
	 System.out.println(sumDouble(3, 2));
	 System.out.println(sumDouble(2, 2));
  }
}