public class StringE {
     public static Boolean stringE(String str)
     {
         int stringLength = str.length();
         if(stringLength>=2)
         {
             for (int i = 1; i <= 3; i++)
             {
                 if(str.charAt(i)=='e') return true;

             }
         }


         return false;
     }
}
