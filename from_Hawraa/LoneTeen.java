public class LoneTeen{
  public static boolean loneTeen(int a, int b){
    boolean aTeen = (a >= 13 && a <= 19);
	boolean bTeen = (b >= 13 && b <= 19);
	
	if ((aTeen && !bTeen) || (!aTeen && bTeen)){
	 return true;
	}
	else {
	 return false;
    }
  }

   public static void main(String[] args){
   System.out.println(loneTeen(13, 99));
   System.out.println(loneTeen(21, 19));
   System.out.println(loneTeen(13, 13));   
  }
}