public class IcyHot {
     public static Boolean icyHot(int temp1, int temp2)
     {
         if(temp1 >0&& temp2>0 || temp1<0 && temp2<0)
         {
             return false;
         }
         else return true;
     }
}
