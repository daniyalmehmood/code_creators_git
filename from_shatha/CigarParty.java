public class CigarParty {
    public static boolean isSuccessfulSquirrelParty(int cigars, boolean isWeekend) {
          if (isWeekend){
              return cigars>=40;
          }
          else{
              return cigars>=40 && cigars<=60;
          }
    }
    public static void main (String[] args){
        System.out.println(isSuccessfulSquirrelParty(30,false));
        System.out.println(isSuccessfulSquirrelParty(50,false));
        System.out.println(isSuccessfulSquirrelParty(70,true));
    }
}
