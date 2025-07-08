public class NearHundred {
   public static Boolean nearHundred(int n)
   {
       boolean result;
       boolean isWithin10Of100= Math.abs(n - 100) <= 10;
       boolean isWithin200= Math.abs(n - 200) <= 10;
       if(isWithin10Of100 || isWithin200){
           result = true;
       }
       else{
           result = false;
       }
       return result;
   }
}

