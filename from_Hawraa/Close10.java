public class Close10{
  public static int close10(int a, int b){
  int aNum = Math.abs(10 - a);
  int bNum = Math.abs(10 - b);
  
  if (aNum > bNum){
   return b;
  }
  else if(aNum < bNum){
   return a;
  }
  else{
      return 0;
  }
 }
 
 public static void main(String[] args) {
        System.out.println(close10(8, 13)); 
        System.out.println(close10(13, 8));       
        System.out.println(close10(13, 7));        
    }
}